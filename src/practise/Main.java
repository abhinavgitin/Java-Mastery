package practise;

public class Main {
    static void main() {
        Inventory inventory = new Inventory();

        InputItem input = new InputItem();

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
                input.inputItemName(),
                input.inputQuantity(),
                input.inputAmount(),
                input.inputFruitName(),
                input.inputFruitType()
        );
//        inventory.addItem(item1);
//        inventory.addItem(item2);
//        inventory.addItem(item3);
        inventory.addItem(item4);
        inventory.addItem(item5);

        System.out.println();
        inventory.displayItems();
    }
}
