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
}
