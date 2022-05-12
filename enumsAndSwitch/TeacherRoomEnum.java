
import java.util.Scanner;


public class TeacherRoomEnum {
    public static class TeacherSwitch {
        
        
    // Enumeration for the day of the week and who is working
    enum TeacherRoom { 
        BOURASA(211),
        PAINCHAUD(210),
        BOMBA(209),
        BROWN(216),
        SCHULTZ(217),
        FATADO(218);
        
        private final int roomNumber;

        private TeacherRoom(int roomNumber) {
            this.roomNumber = roomNumber;
        }
    } 

    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Which teacher are you looking for ?");
        String inputedTeacher = input.nextLine().toUpperCase();
        
        //instantiating object of enum
        TeacherRoom room;
        
        //creating objetc for the enum
        switch(inputedTeacher){
            case "BOURASA":
                room = TeacherRoom.BOURASA;
                break;
                
            case "PAINCHAUD":
                room = TeacherRoom.PAINCHAUD;
                break;
                
            case "BOMBA":
                room = TeacherRoom.BOMBA;
                break;
                
            case "BROWN":
                room = TeacherRoom.BROWN;
                break;
                
            case "SCHULTZ":
                room = TeacherRoom.SCHULTZ;
                break;
                
            case "FATADO":
                room = TeacherRoom.FATADO;
                break;
                
            default:
                room = TeacherRoom.PAINCHAUD;
                break;
        }
        
        
        
        
        switch(room){
            
            case BOURASA:
                System.out.println("Ms. Bourasa's room number is: " + room.roomNumber);
                break;

            case PAINCHAUD:
                System.out.println("Ms. Painchaud's room number is: " + room.roomNumber);
                break;

            case BOMBA:
                System.out.println("Mr. Bomba's room number is: " + room.roomNumber);
                break;

            case BROWN:
                System.out.println("Ms. Brown's room number is: " + room.roomNumber);
                break;

            case SCHULTZ:
                System.out.println("Ms. Schultz's room number is: " + room.roomNumber);
                break;

            case FATADO:
                System.out.println("Mr. Fatado's room number is: " + room.roomNumber);
                break;

            default:
                System.out.println("Room doesnt exist");
        }
    }
   
}
}
