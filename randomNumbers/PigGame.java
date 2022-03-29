package randomNumbers;

import java.util.Scanner;
import java.util.Random;
 

 public class PigGame {

	public static void main(String[] args) {
		
                
                //represents your dice roll numbers
                int userRoll1 = 0;
                int userRoll2 = 0;
                
                //computer dice roll numbers
                int compRoll1 = 0;
                int compRoll2 = 0;
                
                //keeps track of users and computers total number
                int userCount = 0;
                int compCount = 0;
                
                //last player that has rolled
                //true for user, false for computer
                boolean lastPlayer = true;
                
                int x = 0;
                while(x == 0){
                    if(lastPlayer == true){
                        System.out.println("_________USERS TURN__________");
                        System.out.println("TEST------: " + userCount);
                        roll(userRoll1, userRoll2, userCount);
                        lastPlayer = false;
                    }
                    else{
                        System.out.println("_________COMPUTERS TURN__________");
                        roll(compRoll1, compRoll2, compCount);
                        lastPlayer = true;
                    }
                }
             

	}
        
        
        //void for rolling the dice
        public static int roll(int num1, int num2, int count){
            Random r = new Random();
            
            //loops for a hundred rolls
            for(int x = 0; x <= 100; x++){
                num1 = r.nextInt(6) + 1;
                num2 = r.nextInt(6) + 1;
                
                //outputs dice info
                System.out.println("Your rolls are: " + num1 + " and " + num2);

                //if you roll a 1 you reset to zero and the other player plays their turn
                if(num1 == 1 || num2 == 1){
                    System.out.println("you rolled a 1, next players turn");
                    count = 0;
                    return count;
                }
                else{
                    int total = num1 + num2;
                    count += total;
                    
                    //you win if you add upto over 100
                    if(count >= 100){
                        System.out.println("You Win");
                        return count;
                    }
                    //outputs dice info and promts to go again or stop
                    System.out.println("Your Count: " + count);
                    System.out.println("Would you like to coninue:  1=yes  0=no");
                    
                    Scanner input = new Scanner(System.in);  
                    if(input.nextInt() == 0){
                        return count;
                    }
                    

                }
            }
            
            return count;
        }
        
        
}