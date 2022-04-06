package chapter5 loops;

import java.util.Scanner;

public class Lowercase {
    private static String word;
    
    public static void main(String[] args){
        
        boolean keepGoing = true;
        
        //keeps prompting until user quits
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a sentence, say exit to close the program");
            word = input.nextLine();
            
            //stops the program if user decides to do so
            if(word == "exit"){
                break;
            }
            
            output();

        }while(keepGoing == true);
    }
    
    public static void output(){
        //outputs what your word in all caps
        System.out.println(word.toUpperCase());
    }
}

