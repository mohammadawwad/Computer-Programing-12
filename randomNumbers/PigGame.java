package randomNumbers;

import java.util.Scanner;
import java.util.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 

 public class PigGame {
     
        //keeps track of users and computers total number
        private static List<Integer> totalUserCount = new ArrayList<>();
        private static List<Integer> totalCompCount = new ArrayList<>();
        
        //keeps track of player score
        private static int userCount;
        private static int compCount;
        
        //represents your dice roll numbers
        private static int roll1;
        private static int roll2;
        
        //user input to play again
        private static int userInput;
        
        //initialising class name
        private static PigGame game;
        
        
	public static void main(String[] args) {
            
            //declaring the games class
            game = new PigGame();
              
            //starts the game
            game.playGame();

	}
        
        public void playGame(){

            //last player that has rolled
            //true for user, false for computer
             boolean lastPlayer = true;
                
                int x = 0;
                while(x == 0){
                    if(lastPlayer == true){
                        System.out.println("_________USERS TURN__________");
                        System.out.println("TEST------: " + userCount);
                        game.roll(userCount, totalUserCount);
                        lastPlayer = false;
                    }
                    else{
                        System.out.println("_________COMPUTERS TURN__________");
                        game.roll(compCount, totalCompCount);
                        lastPlayer = true;
                    }
                }
        }
        
        //void for rolling the dice
        public int roll(int count, List<Integer> listCounter){
            Random r = new Random();
            
            //loop to keep the game going
            for(int x = 0; x <= 100; x++){

                roll1 = r.nextInt(6) + 1;
                roll2 = r.nextInt(6) + 1;
            
                //outputs dice info
                System.out.println("Your rolls are: " + roll1 + " and " + roll2);

                //if you roll a 1 you reset to zero and the other player plays their turn
                if(roll1 == 1 || roll2 == 1){
                    youLose(count, listCounter);
                    return count;
                }
                else{
                    listCounter.add(roll1);
                    listCounter.add(roll2);
                    System.out.println(listCounter);
                    
                    //loops through list of your rolls and adds it to count
                    count = 0;
                    for (int i: listCounter) {
                        count += i;
                    }

                    //you win if you add upto over 100
                    if(count >= 100){
                        System.out.println("You Win");
                        return count;
                    }
                    
                    //method to show your score and asks to play again
                    output(count);
                    
                    if(userInput == 0){
                        return count;
                    }
                }
            
            }
           
            return count;
        }
        
        //resets your score to 0 if you roll a 1
        public int youLose(int count, List<Integer> listCounter){
            System.out.println("you rolled a 1, next players turn");
            count = 0;
            listCounter.clear();
            return count;
        }
        
        //outputs your score and prompts to continue
        public int output(int count){
            //outputs dice info and promts to go again or stop
            System.out.println("Your Count: " + count);
            System.out.println("Would you like to coninue:  1=yes  0=no");

            Scanner input = new Scanner(System.in);  
            userInput = input.nextInt();
            return userInput;
        }
        
}