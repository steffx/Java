import java.util.Scanner;
public class HelloWorld 
{

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please type your name in the console !");
		String name = scan.nextLine();
		System.out.println("Good day, " + name + "!");
		
	}

}
