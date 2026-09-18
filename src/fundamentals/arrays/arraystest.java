package fundamentals.arrays;
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
// 

// class arraystest {
//     public static void main(String[] args) {
//         int arr[] = { 3,2,1 };
//         permutation(arr);
        
//     }

//     public static void permutation(int arr[]) {
//         int n = arr.length;
//         int lastDig = n - 1;
//         boolean Permutation = false;

//         for (int i = lastDig - 1; i >= 0; i--) {
//             if (lastDig > i) {
//                 Permutation = true;
//             } else {
//                 int index = 0;
//                 for (int j = 0; j <= (arr.length - 1) / 2; j++) {
//                     index = arr[i];
//                     arr[i] = arr[(arr.length - 1) - i];
//                     arr[(arr.length - 1) - i] = index;
//                 }
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }
class arraystest {
    public static void main(String[] args) {
        printChar('a', 'z');
    }
    public static void printChar (char a, char b){
        char letters[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(char c : letters){
            if ( c >= a && c <= b) {
                System.out.print(c + " ");
            }
        }
    }
}