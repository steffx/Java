
public class Question16 {

	public static void main(String[] args) {
		int x= 95, y= 45;
		if (x >= 20) { 
		    System.out.print("A"); 
		    x = 30; 
		} else { 
		    if (y < 20) { 
		         System.out.print("B"); 
		         y = 40; 
		    } 
		    x = 50; 
		}

		System.out.print("C"); 
		y = 70; 

		if (x <= 40) { 
		    System.out.print("D"); 
		} 
		else if (y < 50) { 
		 
		if (x < 100) { 
		         System.out.print("E"); 
		    } else { 
		         System.out.print("F"); 
		         y = 50; 
		    } 
		} else if (x > 30) { 
		    System.out.print("G"); 
		}

		System.out.print(x + "" + y);
		
		
		
	}

}
