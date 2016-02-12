import java.util.*;
public class ReadingNamesHelloName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		for (int i=1; i <= 10; i++) {
			System.out.print("Please enter a name ");
			String name = scan.nextLine();
			System.out.println("Hello " + name);
		}
		
		System.out.println("End of the loop");
		
	}

}
