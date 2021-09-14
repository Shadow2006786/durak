package com.dalbaebi.durak.domain;

public final class Card {
    Suit suit;
    CardType cardType;

    private Card(Suit suit, CardType cardType) {
        this.suit = suit;
        this.cardType = cardType;
    }

    public static Card fromInt(int val) {
        int suit = val / 10;
        int card = val % 10;
        return new Card(Suit.values()[suit], CardType.values()[card]);
    }

    public int toInt() {
        return Integer.parseInt("" + suit.ordinal() + cardType.ordinal());
    }
}
