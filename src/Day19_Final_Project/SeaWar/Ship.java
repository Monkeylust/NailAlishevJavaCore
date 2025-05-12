package Day19_Final_Project.SeaWar;

public class Ship {
    private Deck countDeck;

    public Ship(Deck countDeck) {
        this.countDeck = countDeck;
    }

    public Deck getCountDeck() {
        return countDeck;
    }

    enum Deck {
        ONE(1), TWO(2), THREE(3), FOUR(4);

        private int value;

        Deck(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}