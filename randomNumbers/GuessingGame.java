package randomNumbers;

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
                int computerNum;
                
                //keeps laying untill number is correct
                do {
                    //creates random number between 0 to 10
                    computerNum = r.nextInt(11);
                
                    //asks for user input
                    System.out.println("Guess The Number: ");
                    userNum = input.nextInt();
                    
                    //outputs the numbers
                    System.out.println("Your Number: " + userNum);
                    System.out.println("Computer Number: " + computerNum);
                    
                    //outputs you win
                    if(computerNum == userNum){
                        System.out.println("You Win!");
                    } 
                    else {
                        System.out.println("Try Again \n");
                   }
                }while(userNum != computerNum);

                
		
	}
}