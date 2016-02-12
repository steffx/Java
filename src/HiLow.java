import java.util.Scanner; 
public class HiLow {

	public static void main(String[] args) {
		// get ready for the player to use the keyboard
		Scanner scan = new Scanner(System.in);
		//create a number from 1 to 100
		String playAgain = "";
		//do loop
		do{				
		int theNumber = (int)(Math.random()*100 + 1);
		int guess = 0;
		
		while (guess != theNumber ) {
			System.out.println("Guess a number between 1 and 100");
			//get the user's guess
			guess = scan.nextInt();
			if (guess < theNumber)
				System.out.println(guess + " is too low. Try again");
			else if  (guess > theNumber)
				System.out.println(guess + " is too high. Try again");
			else
				System.out.println(guess + " is correct! You win!");
			
		}  // end of while loop for guessing		
		// ask the user if he wants to play again
		System.out.println("Would you like to play again(y/n)?");
		playAgain = scan.next();
		} //end of the do loop
		while (playAgain.equalsIgnoreCase("y"));
		//thank the user for playing
		System.out.println("Thanks for playing. Bye !");
		}  
	}


