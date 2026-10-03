package practise;

public class Item {
    private final String itemName;
    private final int quantity;
    private final float amount;

    public Item(String itemName, int quantity, float amount) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.amount = amount;
    }

//    public String getItemName() {
//        return itemName;
//    }
//    public int getQuantity() {
//        return quantity;
//    }
//    public float getAmount() {
//        return amount;
//    }

    @Override
    public String toString() {
        return "Item{" + "itemName='" + itemName + '\'' + ", quantity=" + quantity + ", amount=" + amount + '}';
    }
}
