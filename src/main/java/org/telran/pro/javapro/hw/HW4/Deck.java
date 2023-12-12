package org.telran.pro.javapro.hw.HW4;

public class Deck implements DeckInit, PlayerInit{
    final private int cardsForPlayer = 5;
    final private int numberOfCards = Suits.values().length * Rank.values().length;

    public int getCardsForPlayer() {
        return cardsForPlayer;
    }
    public int getNumberOfCards() {
        return numberOfCards;
    }

}
