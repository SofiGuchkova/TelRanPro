package org.telran.pro.javapro.hw.HW4;

import java.util.Random;

public interface DeckInit {
    Card[] deck = new Card[new Deck().getNumberOfCards()];

    default void deckInit() {
        for (int i = 0; i < Rank.values().length; i++) {
            for (int j = 0; j < Suits.values().length; j++) {
                deck[Suits.values().length * i + j] = new Card(Suits.values()[j], Rank.values()[i]);
            }
        }
    }

    default void deckShuffle() {
        Random random = new Random();
        for (int i = 0; i < new Deck().getNumberOfCards(); i++) {
            int card = i + (random.nextInt(new Deck().getNumberOfCards() - i)); // случайная карта в колоде
            Card temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
    }
     // раздача карт
    default Card[] dealToPlayers(int numOfPlayers, int cardsForPlayer) {
        Card[] hands = new Card[numOfPlayers * cardsForPlayer];
        int x = 0;

        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsForPlayer; j++) {
                hands[x++] = deck[i * cardsForPlayer + j];
            }
        }

        return hands;
    }

}