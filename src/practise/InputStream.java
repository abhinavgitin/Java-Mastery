package practise;

import java.util.Scanner;

public class InputStream {
    private static final Scanner sc = new Scanner(System.in);
    String inputItemName() {
        System.out.print("Enter the name : ");
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
    String inputPlaceCoordinaes() {
        System.out.print("Enter the Coordinates of the place : ");
        return sc.nextLine();
    }
    float inputRating() {
        System.out.print("Enter the Rating for the place : ");
        float rating = sc.nextFloat();
        sc.nextLine();
        return rating;
    }
}
