
public class MoreMonths{ 

    public static void main(String[] args){
        //initialising and setting the enum
        Month month; 
        month = Month.JANUARY; 
        
        //outputs the first months details
        System.out.println("Month: " + month + " " + month.numberOfDays()); 
        System.out.println("--------------------") ;
    
            //loops through the enum Month and outputs all the data
            for (Month i: Month.values( )){ 
                System.out.println("Month:  " + i + " - " + i.monthToNumber() + " - " + + i.numberOfDays() + " - "  + i.monthToSeason()); 
            } 
       } 
} 