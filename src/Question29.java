import java.util.Scanner;
public class Question29 {

	public static void main(String[] args) {
		int x,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Type first number");
		x = scan.nextInt();
		System.out.println("Type second number");
		y = scan.nextInt();
		
		if (x == 0 || y == 0){
			System.out.println("One of the parameters is equal to zero.");
		}
		else if (x % y == 0) {
			System.out.println("The number " + x + " is evenly divisible by " + y + ".");
		}
		else if (y % x == 0) {
			System.out.println("The number " + y + "is evenly divisible by " + x + ".");
		}
		else System.out.println("The numbers are not divisible.");

	}

}
