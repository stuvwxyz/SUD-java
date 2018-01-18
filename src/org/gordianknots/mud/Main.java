package org.gordianknots.mud;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ask player for their name
        Scanner nameReader = new Scanner(System.in);  // Reading from System.in
        System.out.print("What shall your character be called?  ");
        String name = nameReader.nextLine(); // Scans the next token of the input as an int.

        // Create player info
        CharacterInfo player = new CharacterInfo(name);

        System.out.println("Welcome " + player.getCharName() + "! ");
        System.out.println("You are currently level: " + player.getCharLevel());

        Location[] locations = Location.setUpLocations();
        Item[] items = Item.createItems();

//        Need to look into printing arrays without for loop
//        System.out.println(Arrays.toString(items));

        while (player.getCharLocation() != 999) {
            Current.currentLocation(locations, player);
            Move.question(locations, player);
        }
    }
}
