package randomNumbers;

import java.util.Scanner;

class RockPaperScizzors {
    //global variables
    private static int playerScore = 0;
    private static int computerScore = 0;
    private static String opponentMove;
    private static String myMove;
    private static String opponentOutput;
    
    public static void main(String[] args) {

        //Initialize the Scanner and print a welcome message
        Scanner in = new Scanner(System.in);		
        System.out.println("Welcome to Rock, Paper, Scissors!");

        //Use a while(true) loop and only break the loop if the user wants to quit
        while(true) {
            
            //Get the user's move through user input
            System.out.println();
            System.out.print("Enter Your Throw (1=Rock, 2=Paper, 3=Scissors 4=quit) : ");
            myMove = in.nextLine();
            
            switch (myMove) {
                case "1":
                    System.out.println("Player Throws: Rock");
                    break;
                case "2":
                    System.out.println("Player Throws: Paper");
                    break;
                case "3":
                    System.out.println("Player Throws: Scissors");
                    break;
                default:
                    break;
            }
            

            //Check if the user wants to quit the game
            if(myMove.equals("4")) {
                break;
            }

            //Check if the user's move is valid (rock, paper, or scissors)
            if(!myMove.equals("1") && !myMove.equals("2") && !myMove.equals("3")) {
                System.out.println("Your move isn't valid!");

            } else {

                //Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2
                int rand = (int)(Math.random()*3);

                //Convert the random number to a string using conditionals and print the opponent's move
                switch (rand) {
                    case 0:
                        opponentMove = "1";
                        opponentOutput = "Rock";
                        break;
                    case 1:
                        opponentMove = "2";
                        opponentOutput = "Paper";
                        break;
                    case 3:
                        opponentMove = "3";
                        opponentOutput = "Scissors";
                        break;
                }
                System.out.println("Computer Throws: " + opponentOutput);

                //outputs win tie or lose
                results();

                //keeps track of score aand outputs it
                scoreKeeper();
            }

        }

        //Print a final message for the user
        System.out.println("Thanks for playing Rock, Paper, Scissors!");

    }

    private static void results() {
        //Print the results of the game: tie, lose, win
        if(myMove.equals(opponentMove)) {
                System.out.println("It's a tie!");
                System.out.println();

        } else if((myMove.equals("1") && opponentMove.equals("3")) || (myMove.equals("3") && opponentMove.equals("2")) || (myMove.equals("2") && opponentMove.equals("1"))) {
                System.out.println("You won!");
                playerScore += 1;
                System.out.println();

        } else {
                System.out.println("You lost!");
                computerScore += 1;
                System.out.println();
        }
    }
    
    private static void scoreKeeper() {
      //outputs the score
      System.out.println("Your Score: " + playerScore);
      System.out.println("Computer Score: " + computerScore);
    }
}