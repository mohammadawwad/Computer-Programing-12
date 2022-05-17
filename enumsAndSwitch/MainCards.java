
public class MainCards{ 

    public static void main(String[] args){
        
        //initialising and setting the enum
        ChooseEnum generateCard = new ChooseEnum();
        
        //initilising the tyoe of card that will be pulled
        generateCard.initializeEnum();
        
        //outputs the first months details
        System.out.println("You Recieve: " + generateCard.cards.randomCard() + " of " + generateCard.cards); 
   
    } 
} 