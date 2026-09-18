package fundamentals.tests;

import java.util.*;

class TestAsciiCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        if ( ascii >= 65 && ascii <= 90) {
            System.out.println("Uppercase Letter");
        } else if (ascii >= 97 && ascii <= 122) {
            System.out.println("Lowercase Letter");
        } else if (ascii >= 48 && ascii <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
        sc.close();
    }
}
