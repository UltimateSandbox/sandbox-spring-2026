package org.example.sandbox.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StandardDeck implements Deck {

    List<Card> cards;

    public StandardDeck() {
        this.cards = newDeck();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StandardDeck {");
        sb.append(cards);
        sb.append('}');
        return sb.toString();
    }

    private List<Card> newDeck() {

        List<Card> cards = new ArrayList<>();

        Arrays.stream(Suit.values()).forEach(suit -> {
            Arrays.stream(FaceValue.values())
                    .map(faceValue -> new Card(suit, faceValue))
                    .forEach(cards::add);
        });
        return cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public void shuffle() {

    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public Card turnOver() {
        return null;
    }

    @Override
    public int search(Card card) {
        return 0;
    }

    @Override
    public void newOrder() {

    }

    @Override
    public int size() {
        return 0;
    }
}
