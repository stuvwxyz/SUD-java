package org.gordianknots.mud;

import java.util.Scanner;

public class CharacterInfo {
    //Initialize Variables
    public String charName;
    public String charClass;
    public int charLevel = 1;
    public int charLocation = 0;

    public String getCharName() {
        return charName;
    }
    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getCharClass() {
        return charClass;
    }
    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public int getCharLevel() {
        return charLevel;
    }
    public void setCharLevel(int charLevel) {
        this.charLevel = charLevel;
    }

    public int getCharLocation() {
        return charLocation;
    }
    public void setCharLocation(int charLocation) {
        this.charLocation = charLocation;
    }

    // constructor that takes no values
    public CharacterInfo() {}

    // Constructor for name
    public CharacterInfo(String charName) {
        this.charName = charName;
    }

}
