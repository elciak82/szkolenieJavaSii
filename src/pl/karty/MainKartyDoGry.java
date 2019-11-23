package pl.karty;

public class MainKartyDoGry {
    public static void main(String[] args) {
        Color[] colorValues = Color.values();
        Suit[] suitValues = Suit.values();

        for (Suit suit : suitValues) {
            for (Color color : colorValues) {
                Card card = new Card(suit, color);

                System.out.println(card);
            }
        }
    }

}
