import java.util.*;

class RandomNumber {
    public static int getRandomNumber() {
        // Initialize static variables
        Random random = new Random();

        int min = 1; // Define the minimum range
        int max = 100; // Define the maximum range

        // Generate a random number in the range [min, max]
        int randNumber = random.nextInt((max - min) + 1) + min;
        return randNumber;
    }

    public static void main(String[] args) throws Exception {
        // Generate and print random number
        System.out.println("Random Number: " + getRandomNumber());
        probability();
    }

    static void probability() {
        int num[] = new int[101];
        int noOfTimes = 10000;

        for (int i = 0; i < noOfTimes; i++) {
            num[getRandomNumber()]++;
        }

        int maxRecorded = 0;
        int number = 0;

        for (int i = 1; i <= 100; i++) { // FIXED RANGE
            if (num[i] > maxRecorded) {
                maxRecorded = num[i];
                number = i;
            }
        }

        System.out.println("\nThe number that appeared most: " + number + "\nFrequency: " + maxRecorded
                + "\nProbability: " + (maxRecorded / (double) noOfTimes));
    }
}
