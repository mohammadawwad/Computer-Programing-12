
import java.util.Random;


public enum CardsEnum{ 
    
    //enums for each type of card holding a set of 13 cards
    HEARTS(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13),  
    CLUBS(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13),  
    SPADES(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13),  
    DIAMONDS(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13);
    
    //declaring the random object
    Random random = new Random();

    // now list the names of the parameters listed 
    private final Object[] deckOfCards;  

    //creating an object of the values 
    CardsEnum(Object... deck) {  
        this.deckOfCards = deck; 
    } 

    // getters for the object of the cards
    public Object getDeckOfCards() {    
        return deckOfCards; 
    } 
    
    public Object randomCard(){
        //creating a randomizer to pick the card
        int randomCard = random.nextInt(12) + 1;
        return deckOfCards[randomCard];
    }

}

class ChooseEnum{
    //declaring the random object
    Random random = new Random();

    //instantiating object of enum
    CardsEnum cards;
    
    public void initializeEnum(){
        
        //assigns the num based of the random number generated
        switch(random.nextInt(4)){
            case 0:
                cards = CardsEnum.HEARTS;
                break;
                
            case 1:
                cards = CardsEnum.CLUBS;
                break;
                
            case 2:
                cards = CardsEnum.SPADES;
                break;
                
            case 3:
                cards = CardsEnum.DIAMONDS;
                break;
        }
    }
}