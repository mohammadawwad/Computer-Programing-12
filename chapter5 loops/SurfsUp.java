package chapter5 loops;

import java.util.Scanner;

public class SurfsUp {
    public static void main(String[] args){
        
        boolean keepGoing = true;
        
        
        //keeps prompting until user quits
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("How high is the wave?, 0=exit");
            int waveHeight = input.nextInt();
            
            //stops the program if user decides to do so
            if(waveHeight == 0){
                break;
            }
            
            //outputs what you will do next
            if(waveHeight >= 6){
                System.out.println("Crazy " + waveHeight + "foot Wave Dude! What a great day to go surfing!");
            } else{
                System.out.println("The waves only " + waveHeight + "feet, how about we go play checkers at Johny's");
            }
            

        }while(keepGoing == true);
    }
}
