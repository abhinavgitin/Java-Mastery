package practise;

import java.util.Scanner;

public class InputItem {
    private static final Scanner sc = new Scanner(System.in);
    String inputItemName() {
        System.out.print("Enter the name of the Item  : ");
        return sc.nextLine();
    }
    float inputAmount() {
        System.out.print("Enter the amount : ");
        float amt = sc.nextFloat();
        sc.nextLine();
        return amt;
    }
    int inputQuantity() {
        System.out.print("Enter the Quantity : ");
        int quantity = sc.nextInt();
        sc.nextLine();
        return quantity;
    }
    String inputFruitType() {
        System.out.print("Enter the type of the fruit : ");
        return sc.nextLine();
    }
    String inputFruitName() {
        System.out.print("Enter the name of the fruit : ");
        return sc.nextLine();
    }
}
