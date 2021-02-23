import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    private ArrayList<Card> deck;
    //private Image backOfCardImage;

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Deck(){
        List<String> suits = Card.getValidSuits(); // this is calling a static method
                                                    // so we do NOT need an instance of Card to call it
        List<String> faceNames = Card.getValidFaceNames();

        deck = new ArrayList<>();

        for (String suit: suits){
            for (String faceName: faceNames){
                deck.add(new Card(faceName, suit));
            }
        }
    }

    public Card dealTopCard(){
        if (deck.size() > 0)
            return deck.get(0);
        else
            return null;
    }
    public void play(){
        deck.remove(0);
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }

    public int cardsLeft(){
        return deck.size();
    }
}

