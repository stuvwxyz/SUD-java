package org.gordianknots.mud;

import sun.jvm.hotspot.utilities.HashtableBucket;

public class Item {
    public int itemNumber;
    public String itemName;
    public String itemDescriprion;

    public int getItemNum() {
        return itemNumber;
    }

    public void setItemNum(int itemNum) {
        this.itemNumber = itemNum;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescriprion() {
        return itemDescriprion;
    }

    public void setItemDescriprion(String itemDescriprion) {
        this.itemDescriprion = itemDescriprion;
    }

    public Item() {}

    public Item(int iNum, String iName, String iDescriprion) {
        this.itemNumber = iNum;
        this.itemName = iName;
        this.itemDescriprion = iDescriprion;
    }

    public static Item[] createItems() {
        Item[] items = new Item[20];

        items[0] = new Item(0, "Dagger", "Small weapon that can easilly be concealed.");
        items[1] = new Item(1, "Short Sword", "One handed sword about 30 inches long");
        items[2] = new Item(2, "Long Sword", "One handed sword about 40 inches long");
        items[3] = new Item(3, "Two-Handed Sword", "Large sword that requires two hands to wield.");

        items[4] = new Item(4, "Buckler", "Very small oval shield that buckles onto your foremarm.");
        items[5] = new Item(5, "Small Shiled", "Small shield.");
        items[6] = new Item(6, "Tower Shield", "Large shield that requires extra strength to carry");

        items[7] = new Item(7, "Cloth Armor", "Very light armor that provides slight protection.");
        items[8] = new Item(8, "Leather Armor", "Lightweight armor that doesn't hinder movement");
        items[9] = new Item(9, "Chain Armor", "Heavier armor that offers better potection but may cause issues with mobility.");

        items[10] = new Item(10, "Wand", "Carved willoy branch that enhances your focus on spells");

        items[11] = new Item(11, "Robes", "Provide light armomr and enhances your spell abilites");
        items[12] = new Item(12, "Wizard Hat", "Fancy pointed hat like all the awesome wizards wear");

        return items;
    }
}
