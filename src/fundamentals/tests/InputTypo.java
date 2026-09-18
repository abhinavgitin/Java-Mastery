package fundamentals.tests;

/*
 * The problem is when we need to take the input we do the work as
 * sysop and then the message, and then
 * we do the input from the user using the scanner class so it becomes like somewhat
 * System.out.println("Your message for the input that you are going to take");
 * int a = sc.nextInt();
 * like this and this is very irritating so why not make a function that does this work nicely*/

import java.util.Scanner;

public class InputTypo {
    private static final Scanner sc = new Scanner(System.in);
    private static int getIntegerInput( String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    static void main() {
        System.out.println("Enter the two numbers for addition : ");
        int a = getIntegerInput("Enter the first Number : ");
        int b = getIntegerInput("Enter the second Number : ");
        System.out.println("Addition of the two is : "+(a+b));
    }
}
