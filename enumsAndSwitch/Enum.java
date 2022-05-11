
public class Enum {
    // Simple switch statement example no breaks 
 
public static class SimpleSwitch { 
 
    // Enumeration for day of the week
    enum DayofWeek { 
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY 
    } 

    // Enumeration for who is working
    enum Eployee { 
        MONDAY("Mrs. P"), TUESDAY("Mrs. P"), WEDNESDAY("Mrs. P"), THURSDAY("Aidan"), FRIDAY("Mohammad"), SATURDAY("Nobody"), SUNDAY("Mohammad")
    } 
 
    public static void main(String[] args) { 

        //creating objetcs og the enums
        DayofWeek day = DayofWeek.MONDAY; 
        Employee employee = Employee.MONDAY; 
        
        System.out.println("MONDAY = " + DayofWeek.MONDAY.ordinal()); 
        System.out.println("TUESDAY = " + DayofWeek.TUESDAY.ordinal()); 
        System.out.println("WEDNESDAY = " + DayofWeek.WEDNESDAY.ordinal()); 
        System.out.println("THURSDAY = " + DayofWeek.THURSDAY.ordinal()); 
        System.out.println("FRIDAY = " + DayofWeek.FRIDAY.ordinal()); 
        System.out.println("SATURDAY = " + DayofWeek.SATURDAY.ordinal()); 
        System.out.println("SUNDAY = " + DayofWeek.SUNDAY.ordinal()); 
         
        // Switch statement 
        switch (day) { 

            //mon to thurs all have the same office hours
            case MONDAY: 
            case TUESDAY:   
            case WEDNESDAY: 
            case THURSDAY: 
                System.out.println("Hours on " + day + " are 8:00am to 6:00pm"); 
                System.out.println("Employee Working: " + emploee); 
                break; 
            
            case FRIDAY: 
                System.out.println("Hours on " + day + " are 8:00am to 9:00pm");
                System.out.println("Employee Working: " + emploee); 
                break; 
                
            case SATURDAY: 
                System.out.println("Sorry we are closed on " + day);
                System.out.println("Employee Working: " + emploee); 
                break;
            
            case SUNDAY: 
                System.out.println("Hours on " + day + " are 10:00am to 6:00pm");
                System.out.println("Employee Working: " + emploee); 
                break; 
        } 

        
    } 
} 
}
