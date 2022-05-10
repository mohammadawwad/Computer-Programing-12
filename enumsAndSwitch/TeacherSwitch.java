import java.util.Scanner;

public class TeacherSwitch {

    static Scanner input = new Scanner(System.in);
    
    public static void main (String[] args){

        //prompts for a users input
        System.out.println("What room would you like to check");
        int roomNum = input.nextInt();

        //outputs according to the number you entered
        switch(roomNum){
            
            case 211:
                System.out.println("Ms. Bourasa's room number is: 211");
                break;

            case 210:
                System.out.println("Ms. Painchaud's room number is: 210");
                break;

            case 209:
                System.out.println("Mr. Bomba's room number is: 209");
                break;

            case 216:
                System.out.println("Ms. Brown's room number is: 216");
                break;

            case 217:
                System.out.println("Ms. Schultz's room number is: 217");
                break;

            case 218:
                System.out.println("Mr. Fatado's room number is: 218");
                break;

            default:
                System.out.println("Room doesnt exist");
        }
    }
   
}