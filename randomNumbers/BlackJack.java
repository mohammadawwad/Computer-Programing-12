package randomNumbers;

import java.util.Random;
import java.util.Arrays;
import java .util.Scanner;

public class BlackJack {
    
    //matrix of all possible cards 
    static int [][] cardDeck = {
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
    };
    
    static int userAction;
    static Random random;
    static int yourCard;
    static int row, coloumn;
    
    public static void main(String[] args){
        printMatrix(cardDeck);
        
        promptForCard();
        updateCardDeck();
    }
    
    
    public static int promptForCard(){
        System.out.println("Would you like a Card:  1=yes  0=no");
        Scanner input = new Scanner(System.in);
        userAction = input.nextInt();
        
        return userAction;
    }
    
    public static int[][] updateCardDeck(){
        if(userAction == 1){
            giveCard();
            System.out.println(yourCard);
            
            printMatrix(cardDeck);
        }
        return cardDeck;
    }
    
    public static int giveCard(){
        random = new Random();
        
        //gives random card between 1 to 10
        row = random.nextInt(9);
        coloumn = random.nextInt(3);
        
        yourCard = cardDeck[coloumn][row];
                
        return yourCard;
    }
    
    //method that converts matrix to string for output
    public static void printMatrix(int matrix[][]){
        for (int[] row : matrix) {
            // convert each row to a String before printing
            System.out.println(Arrays.toString(row));
        }
    }
}
