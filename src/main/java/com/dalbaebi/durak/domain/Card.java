package com.dalbaebi.durak.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public final class Card {
    Suit suit;
    CardType cardType;

    public Card(Suit suit, CardType cardType) {
        this.suit = suit;
        this.cardType = cardType;
    }
}
