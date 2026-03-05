package axhopf;

import java.util.ArrayList;

public class SupportGroup extends Resource {
	
	private ArrayList<User> member = new ArrayList<>();
	
	public int getMembers() {
		return member.size();
	}
	
	public void addMember(User newUser) {
	    this.member.add(newUser);
	}
	
	public SupportGroup()
	{
		setName("");
		setDescription("");
	}
	
	public SupportGroup(String name, String desc, ArrayList<User> members)
	{
		setName(name);
		setDescription(desc);
		this.member = members;
	}

	@Override
	public String toString()
	{
		return String.format("Name: %s || Members: %d\nDescription: %s\n", this.getName(), this.getMembers(), this.getDescription());
	}

}
