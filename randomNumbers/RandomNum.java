package randomNumbers;

import java.util.Random;
 

 public class RandomNum {

	public static void main(String[] args) {
		Random r = new Random();
				
		System.out.println("First number: " + r.nextInt(100));
		System.out.println("Second number: " + r.nextInt(100));
		System.out.println("Third number: " + r.nextInt(100));
		System.out.println("Fourth number: " + r.nextInt(100));
		System.out.println("Fifth number: " + r.nextInt(100));
		
	}
}