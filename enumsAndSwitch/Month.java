
public enum Month{ 
    
    //oreder of months with number of days in each
    JANUARY(1, 31),  
    FEBRUARY(2, 28),  
    MARCH(3, 31),  
    APRIL(4, 30),  
    MAY(5, 31),  
    JUNE(6, 30), 
    JULY(7, 31),  
    AUGUST(8, 31),  
    SEPTEMBER(9, 30),  
    OCTOBER(10, 31),  
    NOVEMBER(11, 30),  
    DECEMBER(12, 31); 

    // now list the names of the parameters listed 
    private final int order;  
    private final int days; 

    // now list the settings of these parts of the objects - setter 
    Month(int order, int days) {  // name of enum 
        this.order = order; 
        this.days = days;
    } 

    // getters for the days and order of each month
    public int numberOfDays() {    
        return days; 
    } 

    public int monthToNumber(){ 
        return order; 
    } 


    //Method to return the season based off the month
    public String monthToSeason(){ 
        String season; 

        switch (this) { 
            case JANUARY: 
            case FEBRUARY: 
            case MARCH: 
                season = "Winter"; 
                break; 
                
            case APRIL: 
            case MAY: 
            case JUNE: 
                season = "Spring"; 
                break; 
                
            case JULY: 
            case AUGUST: 
            case SEPTEMBER:
                season = "Summer" ;
                break; 
                
            case OCTOBER: 
            case NOVEMBER: 
            case DECEMBER: 
                season = "Fall"; 
                break; 
                
            default: 
                season = "unknown"; 
                break; 
        } 
        
        return season;
    } 
}