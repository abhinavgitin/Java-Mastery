package practise;

public class Fruit extends Item {
    String fruitName;
    String type;

    public Fruit(String fruitName, int quantity, float amount, String type) {
        super(quantity, amount);
        this.fruitName = fruitName;
        this.type = type;
    }
//     String getFruitName() {
//        return fruitName;
//     }
//     String getType() {
//        return type;
//     }

    @Override
    public String toString() {
        return "Fruit{" + "fruitName='" + fruitName + '\'' + ", type='" + type + '\'' + '}';
    }
}
