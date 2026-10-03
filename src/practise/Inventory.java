package practise;

import java.util.ArrayList;

public class Inventory {

    private final ArrayList<Item> things;
    public Inventory() {
        things = new ArrayList<>(); // just initialize the arraylist empty
    }
    // is generic for all
    public void addItem( Item item ) {
        things.add(item);
    }
    // is for the fruit
    public void addItem(String fruitName, String type, float amount, int quantity) {
        things.add(new Fruit(fruitName, quantity,amount,type));
    }
    // is for the place addon
    public void addItem(String placeName, float amount, String coordinates, float rating) {
        things.add(new Place(placeName,coordinates,amount, rating));
    }

    public void displayItems() {
        for ( Item items : things ) {
            System.out.println(items.toString());
        }
    }
}
