package practise;

public class Item {
    private String name;
    private int quantity;
    private float amount;

    public Item(int quantity, float amount) {
        this.quantity = quantity;
        this.amount = amount;
    }

    public Item(String name, float amount) {
        this.name = name;
        this.amount = amount;
    }

    public Item(String name, int quantity, float amount) {
        this.name = name;
        this.quantity = quantity;
        this.amount = amount;
    }

//    public String getItemName() {
//        return name;
//    }
//    public int getQuantity() {
//        return quantity;
//    }
//    public float getAmount() {
//        return amount;
//    }

    @Override
    public String toString() {
        return "Item{" + "name='" + name + '\'' + ", quantity=" + quantity + ", amount=" + amount + '}';
    }
}
