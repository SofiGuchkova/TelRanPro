package org.telran.pro.javapro.hw.HW4;

import java.util.Scanner;

public interface PlayerInit {
    Scanner sc = new Scanner(System.in);
    default int playerInit() {


        int players;
        while (true) {
            System.out.println("Enter the number of players: ");
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (new Deck().getCardsForPlayer() * players <= new Deck().getNumberOfCards()) {
                    return players;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }

            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }
     return players;
    }
}
