package axhopf;

public class DiversityCalculator {
	
	int numBlack, numAsian, numHispanic, numWhite;
	
	
	public double CalculateDiversityIndex(int black, int asian, int hispanic, int white)
	{
		this.numBlack = black; this.numAsian = asian; this.numHispanic = hispanic; this.numWhite = white;
		
		int totalEmployees = black + asian + hispanic + white;
		
		int nBlack = black*(black-1);
		int nAsian = asian*(asian-1);
		int nHispanic = hispanic*(hispanic-1);
		int nWhite = white*(white-1);
		
		int sum = nBlack + nAsian + nHispanic + nWhite;
		
		int totalProduct = totalEmployees*(totalEmployees-1);
		
		double simpsonIndex = (double) sum/totalProduct;
		simpsonIndex = 1-simpsonIndex;
		
		return simpsonIndex*100;
	}

}
