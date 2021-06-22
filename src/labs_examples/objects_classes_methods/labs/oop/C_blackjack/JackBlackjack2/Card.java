package labs_examples.objects_classes_methods.labs.oop.C_blackjack.JackBlackjack2;

public class Card {

    static char[] suits = new char[]{'♠', '♦', '♥', '♣', 'J', 'Q', 'K'};
    public int cardValue;

    // card default constructor
    public Card() {
    }

    ;

    // card custom constructor
    public Card(char[] suits, int cardValue) {
        this.suits = suits;
        this.cardValue = cardValue;
    }
}
