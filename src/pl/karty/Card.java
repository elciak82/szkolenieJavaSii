package pl.karty;

public class Card {
    private Color color;
    private Suit suit;

    Card(Suit suit, Color color) {
        this.suit = suit;
        this.color = color;
    }

    @Override
    public String toString() {
        return suit + " of " + color;
    }

    public Color getColor() {
        return color;
    }

    public Suit getSuit() {
        return suit;
    }
}
