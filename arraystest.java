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

// moving all zeros to the end of the array gfg 2
// class arraytest {
//     public static void main(String[] args) {
//         int arr[] = { 3, 5, 0, 0, 4, 0, 0, 0, 4, 5, 0, 0, 0 };
//         moveZerosToEnd(arr);
//     }

//     static void moveZerosToEnd(int arr[]) {
//         int putnum = 0;
//         int put = 0;
//         int zeroCount = 0;
//         for (int i = 0; i < arr.length; i++) {
//         if (arr[i] == 0) {
//         zeroCount++;
//         }
//         }
//         int zeros[] = new int[zeroCount];
//         int nonZeros[] = new int[(arr.length - zeroCount)];

//         for (int i = 0; i < arr.length; i++) {
//         if (arr[i] == 0) {
//         while (put <= zeros.length) {
//         zeros[put] = arr[i];
//         put++;
//         break;
//         }
//         } else {

//         while (putnum <= nonZeros.length) {
//         nonZeros[putnum] = arr[i];
//         putnum++;
//         break;
//         }
//         }

//         }
//         for (int j = 0; j < nonZeros.length; j++) {
//         System.out.print(nonZeros[j] + " ");
//         }
//         for (int k = 0; k < zeros.length; k++) {
//         System.out.print(zeros[k] + " ");
//         }
//     }
// }

// reverse of an array gfg 3
// class arraytest {
//     public void reverseArray(int arr[]) {
//         // code here
//         int index = 0;
//         for ( int i = 0; i <= (arr.length-1)/2 ; i++){
//             index = arr[i];
//             arr[i] = arr[(arr.length-1)-i];
//             arr[(arr.length-1)-i] = index;
//         }
//     }
// }

// the next gfg dat 4 is to be done 
// class arraystest {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5 };
//         int d = 2; // Number of positions to rotate
//         reverseArray(arr, d);
//     }
//     public static void reverseArray( int arr[], int d){
//         int n = arr.length;
//         d = d % n; // Handle cases where d >= n
//         int [] temp = new int[n];

//         for ( int i = d; i < n; i++){
//             temp[i - d] = arr[i];
//         }
//         for ( int i = 0; i < d; i++){
//             temp[n - d + i] = arr[i];
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.print(temp[i] + " ");
//         }
//         System.out.println();
//     }
// }

//gfg day 5 the next permutation of an array
// class arraystest {
//     public static void main(String[] args) {
//         int arr[] = { 2,4,1,7,5,0};
//         nextPermutation(arr);

//     }

//     public static void nextPermutation(int arr[]) {
//         int n = arr.length;
//         int index = -1;
//         boolean foundThePermutation = false;
//         int justLarger = -1;
//         int largestNumber = -1;
//         for (int i = n - 1; i > 0; i--) {
//             if (!(arr[i] > arr[i - 1])) {
//                 foundThePermutation = true;
//                 index = i;
//                 for (int j = index; j < n; j++) {
//                     if (arr[j] > arr[i]) {
//                         largestNumber = arr[j];
//                     }
//                     if (arr[j] > arr[i] && arr[j] < largestNumber) {
//                         justLarger = arr[j];
//                         break;
//                     }
//                 }
//             }

//         }

//         if (foundThePermutation) {
//             arr[index] = justLarger;
//             for (int i = index + 1; i < (arr.length - 1) / 2; i++) {
//                 int temp = arr[i];
//                 arr[i] = arr[arr.length - 1 - i];
//                 arr[arr.length - 1 - i] = temp;
//             }
//         } else {
//             for (int i = 0; i < arr.length / 2; i++) {
//                 int temp = arr[i];
//                 arr[i] = arr[arr.length - 1 - i];
//                 arr[arr.length - 1 - i] = temp;
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

import java.util.Scanner;

class months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the month ");

        int month = sc.nextInt();
        sc.close();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}