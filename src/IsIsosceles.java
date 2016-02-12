import java.util.Scanner;
public class IsIsosceles {

	public static void main(String[] args) {
		int side1, side2, side3 ;
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Please enter the length of the first side");
		side1 = scan.nextInt();
		System.out.println("Please enter the length of the second side");
		side2 = scan.nextInt();
		System.out.println("Please enter the length of the third side");
		side3 = scan.nextInt();
		
		if (((side1 == side2) && (side1 != side3)) ||
		          ((side1 == side3) && (side1 != side2)) ||
		          ((side2 == side3) && (side2 != side1)))
		         {
			System.out.println("true");
		         }
		      else {
		    	  System.out.println("false");
		      }
		
		
		
		//or in a different way , we check if all of sides are equal first 
	/*	
	 	if(side1 == side2  && side2 == side3) {
			System.out.println("It's not dude!");
		}
        else if((a==b)||(b==c)||(c==a){
        	System.out.println("Indeed it is!");
        }
        
	*/

	} //end of main
} //end of class
