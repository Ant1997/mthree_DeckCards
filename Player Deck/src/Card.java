//import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName, suit;
    //private Image image;

    public String getFaceName() {
        return faceName;
    }

    public static List<String> getValidFaceNames(){
        return Arrays.asList("2","3","4","5");
    }

    /**
     *
     * @param faceName 2,3,4,5
     */
    public void setFaceName(String faceName) {
        List<String> validFaceNames = getValidFaceNames();
        faceName = faceName.toLowerCase();

        if(validFaceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException("Valid face names are: " +
                    validFaceNames);
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        List<String> validSuits = getValidSuits();
        suit = suit.toLowerCase();

        if(validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("Valid suits are: " +
                    validSuits);
    }

    public static List<String> getValidSuits(){
        return Arrays.asList("hearts", "diamonds","spades","clubs");
    }

    public String toString()
    {
        return String.format("%s of %s", faceName, suit);
    }

    public Card(String faceName, String suit){
        setFaceName(faceName);
        setSuit(suit);
    }


}

