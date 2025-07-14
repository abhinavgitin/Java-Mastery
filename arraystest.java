// public class arraystest {
//     public static void main(String[] args) {
//         int arr[] = { 10, 10, 10, 10, 10 };
//         System.out.println("the second largest element is " + secondlargest(arr));
//     }

//     public static int secondlargest(int[] arr) {
//         int largest = arr[0];
//         for (int i = 0; i < arr.length; i++) {

//             if (largest < arr[i]) {
//                 largest = arr[i];

//             }
//         }
//         boolean allfound = false;

//         for (int j = 0; j < arr.length; j++) {
//             if (arr[j] == largest) {
//                 arr[j] = 0;
//             }
//         }
//         for (int m = 0; m < arr.length; m++) {

//             if (arr[m] == 0) {
//                 allfound = true;
//             } else {
//                 allfound = false;
//                 break;
//             }
//         }

//         if (allfound) {
//             return -1; // if all elements are same, return -1
//         } else {
//             int secondLargest = arr[0];
//             for (int k = 0; k < arr.length; k++) {

//                 if (secondLargest < arr[k]) {
//                     secondLargest = arr[k];
//                 }
//             }
//             return secondLargest;
//         }
//     }
// }

// moving all zeros to the end of the array
class arraytest {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 0, 0, 4, 0, 0, 0, 4, 5, 0, 0, 0 };
        moveZerosToEnd(arr);
    }

    static void moveZerosToEnd(int arr[]) {
        int putnum = 0;
        int put = 0;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
        zeroCount++;
        }
        }
        int zeros[] = new int[zeroCount];
        int nonZeros[] = new int[(arr.length - zeroCount)];

        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
        while (put <= zeros.length) {
        zeros[put] = arr[i];
        put++;
        break;
        }
        } else {

        while (putnum <= nonZeros.length) {
        nonZeros[putnum] = arr[i];
        putnum++;
        break;
        }
        }

        }
        for (int j = 0; j < nonZeros.length; j++) {
        System.out.print(nonZeros[j] + " ");
        }
        for (int k = 0; k < zeros.length; k++) {
        System.out.print(zeros[k] + " ");
        }
    }
}