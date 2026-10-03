package practise;

public class Main {
    static void main() {
        Inventory inventory = new Inventory();

        InputStream input = new InputStream();

//        Item item1 = new Item (
//                input.inputItemName(),
//                input.inputQuantity(),
//                input.inputAmount()
//        );
//        Item item2 = new Item (
//                input.inputItemName(),
//                input.inputQuantity(),
//                input.inputAmount()
//        );
//        Item item3 = new Item (
//                input.inputItemName(),
//                input.inputQuantity(),
//                input.inputAmount()
//        );
        Item item4 = new Item (
                input.inputItemName(),
                input.inputQuantity(),
                input.inputAmount()
        );

        Fruit item5 = new Fruit (
                input.inputFruitName(),
                input.inputQuantity(),
                input.inputAmount(),
                input.inputFruitType()
        );
//        inventory.addItem(item1);
//        inventory.addItem(item2);
//        inventory.addItem(item3);
        inventory.addItem(item4);
        inventory.addItem(item5);

        // now instead of making the new Fruit new Item all the time now i can do :
        inventory.addItem("Banana", "African", 78, 12); // for the fruits
        inventory.addItem("Annapurna", 30000f, "28.596111, 83.820274", 10.0f ); // is for place
        inventory.addItem(
                input.inputItemName(),
                input.inputAmount(),
                input.inputPlaceCoordinaes(),
                input.inputRating()
        );
        System.out.println();
        inventory.displayItems();
    }
}
