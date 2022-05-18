
public class MainCards{ 

    public static void main(String[] args){
        
        //initialising and setting the enum
        ChooseEnum generateCard1 = new ChooseEnum();
        ChooseEnum generateCard2 = new ChooseEnum();
        ChooseEnum generateCard3 = new ChooseEnum();
        
        
        //initilising the tyoe of card that will be pulled
        generateCard1.initializeEnum();
        generateCard2.initializeEnum();
        generateCard3.initializeEnum();
        
        
        //casting the numbers cards you get as ints
        int card1 = (int) generateCard1.cards.randomCard();
        int card2 = (int) generateCard2.cards.randomCard();
        int card3 = (int) generateCard3.cards.randomCard();
        
        //outputs the first months details
        System.out.println("You Recieve: " + card1 + " of " + generateCard1.cards); 
        System.out.println("You Recieve: " + card2 + " of " + generateCard2.cards); 
        System.out.println("You Recieve: " + card3 + " of " + generateCard3.cards); 
        
        
        //adding and outputting the total
        int cardTotal = card1 + card2 + card3;
        System.out.println("Your Total: " + cardTotal);
   
    } 
} 