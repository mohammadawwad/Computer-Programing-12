
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
        
        public final int roomNumber;

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
                System.out.println("Ms. Painchaud's room number is: 210" + room.roomNumber);
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
import java.util.Scanner;

public class HurricaneCatagory {

    static Scanner input = new Scanner(System.in);
    
    public static void main (String[] args){
        System.out.println("Enter the Hurricane Catagory");
        int catagoryLevel = input.nextInt();
        
        switch(catagoryLevel){
            
            case 1:
                System.out.println("74-95 mph or 64-82 kt or 119-153  km/hr");
                break;

            case 2:
                System.out.println("96-110  mph or 83-95 kt or 154-177 km/hr");
                break;

            case 3:
                System.out.println("111-130  mph or 96-113 kt or 178-209 km/hr");
                break;

            case 4:
                System.out.println("131-155  mph or 114-135  kt or 210-249 km/hr");
                break;

            case 5:
                System.out.println("greater than 155 mph or 135 kt or 249 km/hr ");
                break;

            
            default:
                System.out.println("invalid catagory");
        }
    }
   
}