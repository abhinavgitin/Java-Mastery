package fundamentals.basicpractice;

import java.io.*;

class convert {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader obj = new BufferedReader(isr);
        System.out.println("enter a number  : ");
        int inp = Integer.parseInt(obj.readLine());
        int num = inp;
        int hundreds = (num / 100) % 10;
        int tens = (num % 100) / 10;
        int ones = num % 10;
        int thousands = (num / 1000) % 10;
        // here we check the each digits
        // System.out.println("Inp: " + inp);
        // System.out.println("Thousands: " + thousands);
        // System.out.println("Hundreds: " + hundreds);
        // System.out.println("Tens: " + tens);
        // System.out.println("Ones: " + ones);
        String[] numnames = new String[14];
        numnames[0] = "zero";
        numnames[1] = "one";
        numnames[2] = "two";
        numnames[3] = "three";
        numnames[4] = "four";
        numnames[5] = "five";
        numnames[6] = "six";
        numnames[7] = "seven";
        numnames[8] = "eight";
        numnames[9] = "nine";
        numnames[10] = "ten";
        numnames[11] = "hundred";
        numnames[12] = "thousand";
        numnames[13] = "more than thousand";
        // to give in the different word input
        String[] alg = new String[10];
        alg[0] = "";
        alg[1] = "ten";
        alg[2] = "twenty";
        alg[3] = "thirty";
        alg[4] = "forty";
        alg[5] = "fifty";
        alg[6] = "sixty";
        alg[7] = "seventy";
        alg[8] = "eighty";
        alg[9] = "ninety";

        String[] postten = { "eleven", "twelve", "thirteen", "fourteen", "fifeteen", "sixteen", "seventeen", "eighteen",
                "nineteen" };

        if (inp <= 10) { // less than 10
            System.out.println(numnames[inp]);
        } else if (inp > 10 && inp < 100) { // in the range of more than 10
            if (ones != 0) {
                if (tens == 1 && (tens + ones <= 10)) {
                    System.out.println(postten[ones - 1]);
                } else {
                    System.out.println(alg[tens] + " " + numnames[ones]);
                }
            } else {
                System.out.println(alg[tens]);
            }
        } else if (inp > 99 && inp < 999) { // in the range of 100 and more
            if ((tens != 0) && ones == 0) {
                System.out.println(numnames[hundreds] + " " + numnames[11] + " and " + alg[tens]);
            } else if (tens == 0 && ones != 0) {
                System.out.println(numnames[hundreds] + " " + numnames[11] + " and " + numnames[ones]);
            } else if (tens == 0 && ones == 0) {
                System.out.println(numnames[hundreds] + " " + numnames[11]);
            } else {
                if (tens == 1 && (tens + ones <= 10)) {
                    System.out.println(numnames[hundreds] + " " + numnames[11] + " and " + postten[ones - 1]);
                } else {
                    System.out
                            .println(numnames[hundreds] + " " + numnames[11] + " " + alg[tens] + " " + numnames[ones]);
                } // for wole number
            }

        } else if (inp > 999 && inp < 10000) { // in the range of 1000 and more
            if (hundreds != 0 && tens != 0 && ones != 0) {
                if (tens == 1 && (tens + ones <= 10)) {
                    System.out.println(numnames[thousands] + " " + numnames[12] + " " + numnames[hundreds] + " "
                            + numnames[11] + " and " + postten[ones - 1]);
                } else {
                    System.out.println(numnames[thousands] + " " + numnames[12] + " " + numnames[hundreds] + " "
                            + numnames[11] + " " + alg[tens] + " " + numnames[ones]);
                    // for whole number
                }
            } else if (hundreds != 0 && tens != 0 && ones == 0) {
                System.out.println(numnames[thousands] + " " + numnames[12] + " " + numnames[hundreds] + " "
                        + numnames[11] + " and " + alg[tens]);
                // for ones
            } else if (hundreds != 0 && tens == 0 && ones != 0) {
                System.out.println(numnames[thousands] + " " + numnames[12] + " " + numnames[hundreds] + " "
                        + numnames[11] + " and " + numnames[ones]);
                // for tens
            } else if (hundreds == 0 && tens != 0 && ones != 0) {
                if ((tens + ones) <= 10 && tens == 1) {
                    System.out.println(numnames[thousands] + " " + numnames[12] + " and " + postten[ones - 1]);
                } else {
                    System.out.println(numnames[thousands] + " " + numnames[12] + " and " + alg[tens] + numnames[ones]);
                }
                // for hundred
            } else if (hundreds != 0 && tens == 0 && ones == 0) {
                System.out.println(
                        numnames[thousands] + " " + numnames[12] + " " + numnames[hundreds] + " " + numnames[11]);
            } else if (hundreds == 0 && tens == 0 && ones != 0) {
                System.out.println(numnames[thousands] + " " + numnames[12] + " and " + numnames[ones]);
            } else if (hundreds == 0 && tens == 0 && ones == 0) {
                System.out.println(numnames[thousands] + " " + numnames[12]);
            } else if (hundreds == 0 && tens != 0 && ones == 0) {
                System.out.println(numnames[thousands] + " " + numnames[12] + " and " + alg[tens]);
            } else {
                return;
            }
        } else {
            System.out.println(numnames[13]);
        }
        System.out.println("success");
    }
}

