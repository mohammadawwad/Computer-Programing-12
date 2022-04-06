package chapter5 loops;

import java.util.Scanner;

public class Wave {
    public static void main(String[] args){
        
        boolean keepGoing = true;
        
        
        //keeps prompting until user quits
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("How high is the wave?, 100=exit");
            int waveHeight = input.nextInt();
            
            //stops the program if user decides to do so
            if(waveHeight == 0){
                break;
            }
            
            //outputs what you will do next
            if(waveHeight >= 6){
                System.out.println("Crazy " + waveHeight + "foot Wave Dude! What a great day to go surfing!");
            } else if(waveHeight < 6 && waveHeight > 3){
                System.out.println("Lets Go Body Boarding");
            } else{
                System.out.println("Whoa! What kind of surf is that?");
            }
            

        }while(keepGoing == true);
    }
}
