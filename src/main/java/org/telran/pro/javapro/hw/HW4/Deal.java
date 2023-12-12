package org.telran.pro.javapro.hw.HW4;

public class Deal extends Deck {

    public static void main(String[] args) {
        Deck game = new Deck();
        int numOfPlayers = game.playerInit();
        int cardsForPlayer = game.getCardsForPlayer();
        game.deckInit();
        game.deckShuffle();

        Card[] hands = game.dealToPlayers(numOfPlayers, cardsForPlayer);

        // Вывод рук для каждого игрока
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Рука игрока " + (i + 1) + ":");
            for (int j = 0; j < cardsForPlayer; j++) {
                System.out.println(hands[i * cardsForPlayer + j]);
            }
            System.out.println();
        }
    }
    }




        // the shuffled deck is displayed



          /* for (int i = 0; i < numOfPlayers * game.getCardsForPlayer(); i++) {
                System.out.println(deck[i]);

                if (i % game.getCardsForPlayer() == game.getCardsForPlayer() - 1)
                    System.out.println();
           }*/









