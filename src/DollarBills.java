
public class DollarBills {

	public static void main(String[] args) {
		int numTwenties, numTens, numFives, numOnes;
		int numDollars = 54;
		
		numTwenties = (int) numDollars/20;
		numDollars = numDollars%20;
		System.out.println("20: " + numTwenties);
		
		numTens = (int) numDollars/10;
		numDollars = numDollars%10;
		System.out.println("10: " + numTens);
		         
		numFives = (int) numDollars/5;
		numDollars = numDollars%5;
		System.out.println("5: " + numFives);
		 
		numOnes = (int) numDollars/1;
		numDollars = numDollars%1;
		System.out.println("1: " + numOnes);
		
	}

}
