import java.util.concurrent.ThreadLocalRandom;
public class RandomNumber01Output {

	public static void main(String[] args) {
		int  min = 0, max = 2;
		int count = 0;
		
		for (int i = 1; i<=50; i++) {
			int ran = ThreadLocalRandom.current().nextInt(min, max );
			count++;
			
			if (ran == 0) {
				System.out.println("No");
			}
			else {
				System.out.println("Yes");
				System.out.println(ran);
			}
			
		}
		System.out.println(count);
		
			

	}

}
