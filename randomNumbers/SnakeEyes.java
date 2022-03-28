package randomNumbers;

import java.util.Scanner;
import java.util.Random;
 
 /**
 * Demonstrates the Random class.
 */
 public class SnakeEyes {

	public static void main(String[] args) {
		Random r = new Random();
                
                //represents your dice roll number
                int num1, num2;
                
                //number of times you got snake eyes
                int count = 0;
                
                //loops for a hundred rolls
                for(int x = 0; x <= 100; x++){
                    num1 = r.nextInt(6) + 1;
                    num2 = r.nextInt(6) + 1;
                    
                    if(num1 == num2){
                        count++;
                    }
                }
                
                System.out.println("You got: " + count + " Snake Eyes... in 100 rolls");

                
		
	}
}























package random;

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
                int computerNum = r.nextInt(max + 1) + min;
                System.out.println("Random Number: " + computerNum);
                
		
	}
}