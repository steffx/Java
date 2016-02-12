import java.util.*;

public class LoopTest2 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			/*
			System.out.println("Enter the size of the square:");
			int squareSize = scan.nextInt();
			
			for(int i=0; i<squareSize; i++) {
				for(int j=0; j<squareSize; j++) {
					System.out.print("X");
				}
				
				System.out.println();
			}
			*/
			
			/* print the reverse of the String*/
			
			System.out.println("Enter something!");
			String userInput = scan.nextLine();
			int length = userInput.length();
			
			for(int i=length-1; i>=0; i--) {
				System.out.print(userInput.substring(i, i+1));
				//System.out.println(userInput.charAt(i));
			}
			
			
			/* count zeros, evens, odds with arithmetic */
			/*
			
			int numZeros = 0;
			int numEvens = 0;
			int numOdds = 0;
			
			
			System.out.println("Enter a number:");
			int userNum = scan.nextInt();
			
			while(userNum>0) {
				int onesDigit = userNum % 10;
				if(onesDigit==0) {
					numZeros++;
				}
				
				if(onesDigit%2==0) {
					numEvens++;
				} else {
					numOdds++;
				}
				userNum = userNum / 10;
			}
			*/
			/* count zeros, evens, odds with chars- INCORRECTLY */
			/*
			String numberString = scan.nextLine();
			
			int numberStringLength = numberString.length();
			
			for(int i=0; i<numberStringLength; i++) {
				char c = numberString.charAt(i);
				
				System.out.println("the char is " + c);
				int cNum = (int) c;
				System.out.println("the number is " + cNum);
				
				if(c=='0') {
					numZeros++;
				}
				
				if(c%2 == 0) {
					numEvens++;
				} else if(c%2 == 1) {
					numOdds++;
				}
				*/
			/* count zeros, evens, odds with chars- CORRECTLY */
				/*
				
				if(c == '0' || c == '2' || c=='4' || c=='6' || c=='8') {
					numEvens++;
				} else if(c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
					numOdds++;
				}
				*/
			
			/* count zeros, evens, odds with Strings */
				/*
				String singleCharSubstring = numberString.substring(i, i+1);
				// will get the substring at position i up to but not including position i+1
				// substring has length 1

				int num = Integer.parseInt(singleCharSubstring);
				
				if(num==0) {
					numZeros++;
				}
				
				
				if(num%2 == 0) {
					numEvens++;
				} else {
					numOdds++;
				}
						
			}	*/
			// System.out.println(numZeros + " zeros, " + numEvens + " evens, and " + numOdds + " odds.");
				 
	}

}