package org.example.sandbox.cards;

public class DeckDriver {

    public static void main(String[] args) {

        Deck cards = new StandardDeck();
        displayDeck(cards);
    }

    private static void displayDeck(Deck cards) {
        System.out.println(cards);
    }
}
