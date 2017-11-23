package org.gordianknots.mud;

import java.util.Scanner;

public class Current {
    public static void currentLocation(Location[] locations, CharacterInfo player) {
        System.out.println("\n\n\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(locations[player.getCharLocation()].locationDescription);
        System.out.println();
        System.out.print("You can move: ");

        for (int i = 0; i < locations[player.getCharLocation()].locationDirections.length; i+=2) {
            if (locations[player.getCharLocation()].locationDirections[i] != null) {
                if (i == 0) {
                    System.out.print(locations[player.getCharLocation()].locationDirections[i]);
                } else {
                    System.out.print(", " + locations[player.getCharLocation()].locationDirections[i]);
                }
            }
        }

    }
}
