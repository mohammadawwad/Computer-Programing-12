
public class MainCards{ 

    public static void main(String[] args){
        
        //initialising and setting the enum
        ChooseEnum generateCard1 = new ChooseEnum();
        ChooseEnum generateCard2 = new ChooseEnum();
        ChooseEnum generateCard3 = new ChooseEnum();
        
        ChooseEnum compGenerateCard1 = new ChooseEnum();
        ChooseEnum compGenerateCard2 = new ChooseEnum();
        ChooseEnum compGenerateCard3 = new ChooseEnum();
        
        //initilising the tyoe of card that will be pulled
        generateCard1.initializeEnum();
        generateCard2.initializeEnum();
        generateCard3.initializeEnum();
        
        compGenerateCard1.initializeEnum();
        compGenerateCard2.initializeEnum();
        compGenerateCard3.initializeEnum();
        
        
        //casting the numbers cards you get as ints
        int card1 = (int) generateCard1.cards.randomCard();
        int card2 = (int) generateCard2.cards.randomCard();
        int card3 = (int) generateCard3.cards.randomCard();
        
        int compCard1 = (int) compGenerateCard1.cards.randomCard();
        int compCard2 = (int) compGenerateCard2.cards.randomCard();
        int compCard3 = (int) compGenerateCard3.cards.randomCard();
        
        //outputs the card you and the computer get
        System.out.println("You Recieve: " + card1 + " of " + generateCard1.cards); 
        System.out.println("You Recieve: " + card2 + " of " + generateCard2.cards); 
        System.out.println("You Recieve: " + card3 + " of " + generateCard3.cards); 
        
        System.out.println();
        System.out.println("You Recieve: " + card1 + " of " + generateCard1.cards); 
        System.out.println("You Recieve: " + card2 + " of " + generateCard2.cards); 
        System.out.println("You Recieve: " + card3 + " of " + generateCard3.cards); 
        
        
        //adding and outputting the total
        int cardTotal = card1 + card2 + card3;
        int compCardTotal = compCard1 + compCard2 + compCard3;
        
        System.out.println();
        System.out.println("Your Total: " + cardTotal);
        System.out.println("Computer Total: " + compCardTotal);
        System.out.println();
        
        //outputs who wins
        if(cardTotal > compCardTotal){
            System.out.println("You Win");
        } else if(cardTotal < compCardTotal){
            System.out.println("Computer Wins");
        } else {
            System.out.println("Draw");
        }
   
    } 
} 