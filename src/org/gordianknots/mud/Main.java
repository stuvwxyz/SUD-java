package org.gordianknots.mud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Variables
        int currentLocation;

        // Ask player for their name
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.print("What shall your character be called?  ");
        String name = reader.next(); // Scans the next token of the input as an int.
        reader.close(); // Close the input

        // Create player info
        CharacterInfo player = new CharacterInfo(name);

        System.out.println("Welcome " + player.getCharName());
        System.out.println("You are currently level: " + player.getCharLevel());

        //Create Locations
        Location[] locations = new Location[16];

        // Create String array for room creation
        String[] locationDirect = new String[] {"e", "1"};

        // Enter values for directions
        locations[0] = new Location(0,
                "You find youself in a townsquare. There are various people moving about their daily routine.", locationDirect);

        locationDirect = new String[] {"e", "2", "s", "12", "w", "0"};
        locations[1] = new Location(1,
                "You walk slowly east down a cobblestone road.", locationDirect);

        locationDirect = new String[] {"e", "3", "w", "1"};
        locations[2] = new Location(2,
                "As you continue down the cobblestone road the trees begin to thicken.", locationDirect);

        locationDirect = new String[] {"e", "5", "s", "4", "w", "2"};
        locations[3] = new Location(3,
                "The cobblestone road continues to the east and an overgrown path leads to a secluded grove to the south.", locationDirect);

        locationDirect = new String[] {"n", "3"};
        locations[4] = new Location(4,
                "You have entered a secluded grove.  You hear small scurrying sounds behind the trees.", locationDirect);

        locationDirect = new String[] {"e", "6", "w", "3"};
        locations[5] = new Location(5,
                "The cobblestone road continues east.  In the distance you can see it curve around a hill.", locationDirect);

        locationDirect = new String[] {"s", "7", "w", "5"};
        locations[6] = new Location(6,
                "The cobblestone road curves south here around a small wooded hill.", locationDirect);

        locationDirect = new String[] {"n", "6", "s", "8"};
        locations[7] = new Location(7,
                "The cobblestone road is less maintained here. Many of the stones are mossy", locationDirect);

        locationDirect = new String[] {"n", "7", "s", "9"};
        locations[8] = new Location(8,
                "There are more holes than cobblestones here. It is obvioous that whatever this road was used for, it it no longer.", locationDirect);

        locationDirect = new String[] {"n", "8", "s", "11", "w", "10"};
        locations[9] = new Location(9,
                "As you crest a rise you can see a sheltered cave to the west and a ravine to the south.", locationDirect);

        locationDirect = new String[] {"e", "9"};
        locations[10] = new Location(10,
                "You are at the entrance to a cave.  Inside you can see a large bear sleeping away in its fuzzy pajamas.  You think better of entering the cave and stay hidden.", locationDirect);

        locationDirect = new String[] {"n", "9"};
        locations[11] = new Location(11,
                "You climb down into the ravine.  The oyther sides are to steap to climb, looks like you are at the end of your walkabout.", locationDirect);

        locationDirect = new String[] {"n", "1", "s", "13"};
        locations[12] = new Location(12,
                "New Description", locationDirect);

        locationDirect = new String[] {"n", "12", "s", "14"};
        locations[13] = new Location(13,
                "New Description", locationDirect);

        locationDirect = new String[] {"n", "13", "e", "15"};
        locations[14] = new Location(14,
                "New Description", locationDirect);

        locationDirect = new String[] {"w", "14", "u", "16"};
        locations[15] = new Location(15,
                "New Description", locationDirect);

        currentLocation = 2;

        System.out.println(locations[currentLocation].locationDescription);
        System.out.println();
        System.out.print("You can move: ");

        for (int i = 0; i < locations[currentLocation].locationDirections.length; i+=2) {
            if (locations[currentLocation].locationDirections[i] != null) {
                if (i == 0) {
                    System.out.print(locations[currentLocation].locationDirections[i]);
                } else {
                    System.out.print(", " + locations[currentLocation].locationDirections[i]);
                }
            }
        }

    }
}
