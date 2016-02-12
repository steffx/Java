import java.util.Scanner;

public class CalculateAverage 
{
	public static void main(String[] args) 
	{
		int num1,num2,num3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		 num1 = input.nextInt();
		System.out.println("Enter a number: ");
		 num2 = input.nextInt();
		System.out.println("Enter a number: ");
		 num3 = input.nextInt();
		//
		int average;
		average = (num1 + num2 + num3) / 3;
		System.out.println("The average of the numbers is " + average);
	}
	
	
}