package randomNumbers;

import java.util.Scanner;
import java.util.Random;
 
 /**
 * Demonstrates the Random class.
 */
 public class MinMaxGame {

	public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
		Random r = new Random();
                
                //gloabals variables
                int min, max;
                
                System.out.println("Enter your min number: ");
                min = input.nextInt();
                
                System.out.println("Enter your max number: ");
                max = input.nextInt();
                
                //creates random number between 0 to 10
                int computerNum = r.nextInt(max + 1 - min) + min;
                System.out.println("Random Number: " + computerNum);
                
		
	}
}