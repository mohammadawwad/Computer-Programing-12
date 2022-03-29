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




