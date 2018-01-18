package org.gordianknots.mud;

import java.util.Arrays;
import java.util.Scanner;

public class Move {

    public static void question(Location[] locations, CharacterInfo player) {
        Scanner moveReader = new Scanner(System.in);  // Reading from System.in
        System.out.println();
        System.out.print("What action would you like to take? ");
        String newLoc = moveReader.nextLine(); // Scans the next token of the input as an int.

        move(locations, player, newLoc);
    }

    public static void move(Location[] locations, CharacterInfo player, String newLoc) {
        boolean found = false;
        for (int i = 0; i < locations[player.getCharLocation()].locationDirections.length; i+=2) {
            if (locations[player.getCharLocation()].locationDirections[i].equals(newLoc)) {
                found = true;
                int updateLoc = Integer.parseInt(locations[player.getCharLocation()].locationDirections[i+1]);
                player.setCharLocation(updateLoc);
            }
        }

        System.out.println(found);
        if (found == true) {
            System.out.println("You have moved " + newLoc);
        }
        else {
            System.out.println("\n\n\n\nThat is not a valid direction");
        }

    }

}
