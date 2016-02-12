import java.util.Scanner;
public class Looptest3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please type the square number:");
		int num = scan.nextInt();
		
		for (int i=0; i<num; i++ ){
			 for(int j=0; j<num; j++){
			 System.out.print("X");				
			}
			 System.out.println("");
		}
		
		
	}
}
