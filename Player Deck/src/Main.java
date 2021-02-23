import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        boolean playAgain = false;
        //Loop start
        do {
            Deck deck = new Deck();
            //System.out.println(deck);

            deck.shuffle();

            if (deck.cardsLeft() > 0) {
                while (deck.cardsLeft() > 0) {
                    playAgain = true;
                    System.out.println("Do you want to draw a card? (1 - to draw)");
                    int yesOrNo = userInput.nextInt();

                    if (yesOrNo == 1) {
                        System.out.println(deck.dealTopCard());
                        deck.play();
                    }
                    System.out.println("There's " + deck.cardsLeft() + " cards left in the deck.");
                }
            }

            System.out.println("\nWould you like to play again (yes or no)?");
                //When deck is empty, ask if user would like to play again, if not, end.
            String play = userInput.nextLine();
            String playAgainInput = userInput.nextLine();

            if (playAgainInput.equals("yes")) {
                playAgain = true;
            } else {
                playAgain = false;
            }

            //System.out.println(playAgainInput);
            //System.out.println(playAgain);
        }while(playAgain);
    }
}
