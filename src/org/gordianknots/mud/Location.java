package org.gordianknots.mud;

import java.util.List;

public class Location {
    public String locationDescription;
    public int locationNumber;
    public String[] locationDirections;

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public int getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(int locationNumber) {
        this.locationNumber = locationNumber;
    }

    public String[]  getLocationDirections() {
        return locationDirections;
    }

    public void setLocationDirections(String[]  locationDirections) {
        this.locationDirections = locationDirections;
    }

    public Location() {}

    public Location(int locNum, String locDesc, String[] locDir) {
        this.locationNumber = locNum;
        this.locationDescription = locDesc;
        this.locationDirections = locDir;
    };

    public static Location[] setUpLocations() {
        //Create Locations
        Location[] locations = new Location[17];

        // Create String array for room creation
        String[] locationDirect = new String[] {"e", "1", "s", "12"};

        // Enter values for directions
        locations[0] = new Location(0,
                "You find youself in a townsquare. There are various people moving about their daily routine.", locationDirect);

        locationDirect = new String[] {"e", "2", "w", "0"};
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

        locationDirect = new String[] {"n", "0", "s", "13"};
        locations[12] = new Location(12,
                "This looks like a heavily traveled packed dirt road.  There is currently no one on it though.", locationDirect);

        locationDirect = new String[] {"n", "12", "s", "14"};
        locations[13] = new Location(13,
                "The road is full of wagon ruts making it diffcult to walk.", locationDirect);

        locationDirect = new String[] {"n", "13", "e", "15"};
        locations[14] = new Location(14,
                "There is a gated cemetary to the east", locationDirect);

        locationDirect = new String[] {"w", "14", "u", "16"};
        locations[15] = new Location(15,
                "Old tombstones are spread around the cemetary.  They are overgrown and the area has a dreary feeling to it.  There is a wall that appears you could climb up.", locationDirect);

        locationDirect = new String[] {"d", "15"};
        locations[16] = new Location(16,
                "You climb up onto the wall and can see the undead trying to climb up from the other side.  They cannot get up easliy but it is only a matter of time before they make it to you.", locationDirect);

        return locations;
    }
}
