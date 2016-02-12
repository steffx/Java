import java.util.Scanner;

public class IncomeTester {

	public static void main(String[] args) {

		System.out.println("Enter your income:");
		
		Scanner scan = new Scanner(System.in);
		int income = scan.nextInt();
		
		if(income < 50000) {
			System.out.println("You need a cosigner.");
		} else if((50000 <= income) && (income <= 100000)) {
			
			System.out.println("How many years at current job?");
			int years = scan.nextInt();
			
			if(years < 2) {
				System.out.println("You need a cosigner.");
			} else {
				System.out.println("You are approved.");
			}
		
		} else { // income > 100000
			System.out.println("You are approved.");
			
		}
		
	}

}