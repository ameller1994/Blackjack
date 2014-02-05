public class Card{
    private final Suit suit;
    private final CardValue cvalue;

    public Card(Suit s, CardValue cv){
        this.suit = s;
        this.cvalue = cv;
    }

    public String toString(){
        return (cvalue.toString() + " OF " + suit.toString());
    }
    
    public int getValue(){
        return cvalue.getValue();
    }
}
