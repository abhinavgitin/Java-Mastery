package practise;

import java.util.ArrayList;

public class Inventory {

    private final ArrayList<Item> things;
    public Inventory() {
        things = new ArrayList<>(); // just initialize the arraylist empty
    }

    public void addItem( Item item ) {
        things.add(item);
    }
    public void displayItems() {
        for ( Item items : things ) {
            System.out.println(items.toString());
        }
    }
}
