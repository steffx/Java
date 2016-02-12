import java.util.*;
public class NegativeNumberInputOutput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean notNegative = true;
		
		while (notNegative) {
			System.out.print("Please enter a number  ");
			int number = scan.nextInt();
			
			if (number < 0) {
				notNegative = false;
				System.out.println(number);
							}
						
				}
		}

}
