package com.dalbaebi.durak.mapper;

import com.dalbaebi.durak.domain.Card;
import com.dalbaebi.durak.domain.CardType;
import com.dalbaebi.durak.domain.Suit;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class CardMapper {

    public Card intToCard(int value) {
        int suit = value / 10;
        int card = value % 10;
        return new Card(Suit.values()[suit], CardType.values()[card]);
    }

    public int CardToInt(Card card) {
        final int cardType = card.getCardType().ordinal() * 10;
        final int suit = card.getSuit().ordinal() % 10;
        return cardType + suit;
    }
}
