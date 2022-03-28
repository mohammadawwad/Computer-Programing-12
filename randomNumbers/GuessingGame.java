package random;

import java.util.Scanner;
import java.util.Random;
 
 /**
 * Demonstrates the Random class.
 */
 public class GuessingGame {

	public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
		Random r = new Random();
                
                //gloabals variables
                int userNum;
                
                //creates random number between 0 to 10
                int computerNum = r.nextInt(11);
                
                //number of tries it took you to guess correctly
                int count = 1;
                
                //keeps laying untill number is correct
                do {
                    //asks for user input
                    System.out.println("Guess The Number: ");
                    userNum = input.nextInt();
                   
                    
                    //outputs you win
                    if(computerNum == userNum){
                        System.out.println("You Win!");
                        System.out.println("It took you: " + count + " tries");
                    } 
                    else {
                        System.out.println("Try Again \n");
                        count++;
                   }
                }while(userNum != computerNum);

                
		
	}
}