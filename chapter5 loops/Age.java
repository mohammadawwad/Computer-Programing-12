package chapter5 loops;

import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        
        for(int x = 0; x <=5; x++){
            Scanner input = new Scanner(System.in);
            System.out.println("How old are you?");
            int age = input.nextInt();
        
            if(age >= 18){
                System.out.println("Your an Adult");               
            } else if(age <= 5){
                System.out.println("Your a Toddler");              
            } else if(age <=10){
                System.out.println("Your a Child");
            } else if(age <= 12){
                System.out.println("Your a PreTeen");
            } else{
                System.out.println("Your a Teenager");
            }    
            x++;
        }

      
    }
}
