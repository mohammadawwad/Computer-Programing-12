
import java.util.Scanner;


public class Enum {
    // Simple switch statement example no breaks 
 
public static class SimpleSwitch { 
 

    // Enumeration for the day of the week and who is working
    enum DayOfWeek { 
        MONDAY("Mrs. P"),
        TUESDAY("Mrs. P"),
        WEDNESDAY("Mrs. P"),
        THURSDAY("Aidan"),
        FRIDAY("Mohammad"),
        SATURDAY("Nobody Aailble"),
        SUNDAY("Mohammad");
        
        public final String employee;

        private DayOfWeek(String employee) {
            this.employee = employee;
        }
    } 
 
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);
        System.out.println("What day is it ?");
        String inputedDay = input.nextLine().toUpperCase();
        
        //instantiating object of enum
        DayOfWeek day;
        
        //creating objetc for the enum
        switch(inputedDay){
            case "MONDAY":
                day = DayOfWeek.MONDAY;
                break;
                
            case "TUESDAY":
                day = DayOfWeek.MONDAY;
                break;
                
            case "WEDNESDAY":
                day = DayOfWeek.WEDNESDAY;
                break;
                
            case "THURSDAY":
                day = DayOfWeek.THURSDAY;
                break;
                
            case "FRIDAY":
                day = DayOfWeek.FRIDAY;
                break;
                
            case "SATURDAY":
                day = DayOfWeek.SATURDAY;
                break;
                
            case "SUNDAY":
                day = DayOfWeek.SUNDAY;
                break;
        }
        
        System.out.println("MONDAY = " + DayOfWeek.MONDAY.ordinal()); 
        System.out.println("TUESDAY = " + DayOfWeek.TUESDAY.ordinal()); 
        System.out.println("WEDNESDAY = " + DayOfWeek.WEDNESDAY.ordinal()); 
        System.out.println("THURSDAY = " + DayOfWeek.THURSDAY.ordinal()); 
        System.out.println("FRIDAY = " + DayOfWeek.FRIDAY.ordinal()); 
        System.out.println("SATURDAY = " + DayOfWeek.SATURDAY.ordinal()); 
        System.out.println("SUNDAY = " + DayOfWeek.SUNDAY.ordinal()); 
         
        // Switch statement 
        switch (day) { 

            //mon to thurs all have the same office hours
            case MONDAY: 
            case TUESDAY:   
            case WEDNESDAY: 
            case THURSDAY: 
                System.out.println("Hours on " + day + " are 8:00am to 6:00pm"); 
                System.out.println("Employee Working: " + day.employee); 
                break; 
            
            case FRIDAY: 
                System.out.println("Hours on " + day + " are 8:00am to 9:00pm");
                System.out.println("Employee Working: " + day.employee); 
                break; 
                
            case SATURDAY: 
                System.out.println("Sorry we are closed on " + day);
                System.out.println("Employee Working: " + day.employee); 
                break;
            
            case SUNDAY: 
                System.out.println("Hours on " + day + " are 10:00am to 6:00pm");
                System.out.println("Employee Working: " + day.employee); 
                break; 
        } 

        
    } 
} 
}
