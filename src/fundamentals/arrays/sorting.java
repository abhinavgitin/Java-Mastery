package fundamentals.arrays;

// import java.util.*;
// class sorting {
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array ");
//         int num = sc.nextInt();
//         int[] arr = new int[num];
//         System.out.println("Enter the elements of the array ");
//         for (int i = 0; i < arr.length ; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for ( int m = 0; m < arr.length ; m++){
//             for ( int n = 0; n < arr.length-m-1 ; n++){
//                 if ( arr[n]> arr[n+1]){
//                     int temp = arr[n];
//                     arr[n] = arr[n+1];
//                     arr[n+1] = temp;
//                 }
//             }
//         }
//         // now printing the sorted array
//         System.out.println("The sorted array is: ");
//         for ( int p = 0; p <arr.length ;p++){
//             System.out.print(arr[p] + " ");
//         }
//         sc.close();
//     }
// }



// import java.util.*;

// class sorting {
//     public static void main ( String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array ");
//         int num = sc.nextInt();
//         int[] arr = new int[num];
//         System.out.println("Enter the elements of the array ");
//         for ( int i = 0; i < arr.length ; i++){
//             arr[i] = sc.nextInt();
//         }
//         // SELECTION SORT
//         for ( int m = 0 ; m < num-1 ; m++){
//             int smallest = m;
//             // last wala aapne aap sort ho jayega isliye num-1 tak hi chalega
//             for ( int n = m+1 ; n < num ; n = n+1){

//                 if ( arr[n] < arr[smallest]){
//                     /* yaha pe 0 aur 1 ke bitch me check hota hai jab (n = m+1 )  jo ki hai n=0+1 = 1 
//                      * agar arr[n] n ka position pe arr[smallest] se chota hai toh ham smallest ka position jo ki 0 tha usko update karte hai n se 
//                      * which is the new index of the smallest position
//                     */
//                     smallest = n; // update yaha hoga
//                     /* now n ka value woh index hoga jo index pe smallest number hai  aur fir n aapne inner loop me jake update hoga n= n+1 */
//                     /* ye pura loop chalte chalte we will get the index of the smallest number in the loop aur for we will swap it */
//                 }
//                 int temp = arr[m];
//                 arr[m] = arr[smallest];
//                 arr[smallest] = temp;
//             }
//         }
//         //  now printing the sorted array 
//         System.out.println("sortedd array");
//         for ( int p = 0; p < arr.length; p++){
//             System.out.print(arr[p]+" ");
//         }
//         System.out.println();
//         sc.close();
//     }
// }
import java.util.*;

class sorting {
    public static void main ( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements of the array ");
        for ( int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        // SELECTION SORT
        /* lets take a example to be                                     2 10 0 1
         * m index = 1
         * current element is 10 at index 1
         * j becomes 0 because m-1 = 1-1 = 0
         * 
         * we have m = 1 so the CURRENT ELEMENT IS 10 and the vlaue of j become 0 because m-1 = 0
         * now we will check if arr[j] > currentElement which is  arr[0] > 10 ( is 2 > 10 ) no so we will not enter the while loop
         * then we assign the current element  which is 10 to arr[j+1] which is arr[1] so now the array becomes 2 "10" 0 1 which was the initial array
         *
         *                                                               2 10 0 1
         * m index = 2
         * current element is 0 at index 2
         * j becomes 1 because m-1 = 2-1 = 1
         * 
         * now we will increment m to 2 so CURRENT ELEMENT BECOMES 0 which is at index 2 and j becomes 1
         * now we will check if arr[j] { 1st index which is 10 } > currentElement which is 0 ( is 10 > 0 ) yes so we will enter the while loop
         * and then we will assign the arr[j] { 1st index which is 10 } to arr[j+1] {2nd index which is 0} so now the array becomes 2 10 10 1
         * now we will decrement j and it becomes 0 from 1  
         * and check if arr[j] { 0th index which is 2 } > currentElement which is 0 ( is 2 > 0 ) yes so we will enter the while loop
         * and then we will assign the arr[j] { 0th index which is 2 } to arr[j+1] {1st index which is 10} so now the array becomes 2 2 10 1
         * now we will decrement j and it becomes -1 from 0 and the loop will break because j is less than 0 rember that j is -1 after decrementing by j--
         * * now we will assign the currentElement which is 0 to arr[j+1] { 0th index which is 2 } so now the array becomes 0 2 10 1
         * 
         *                                                                0 2 10 1
         * m index = 3 
         * current element is 1 at index 3
         * j becomes 2 because m-1 = 3-1 = 2
         * 
         * now we will increment m to 3 so CURRENT ELEMENT BECOMES 1 which is at index 3 and j becomes 2
         * now we will check if arr[j] { 2nd index which is 10 } > currentElement which is 1 ( is 10 > 1 ) yes so we will enter the while loop
         * and then we will assign the arr[j] { 2nd index which is 10 } to arr[j+1] {3rd index which is 1} so now the array becomes 0 2 10 10
         * now we will decrement j and it becomes 1 from 2
         * and check if arr[j] { 1st index which is 2 } > currentElement which is 1 ( is 2 > 1 ) yes so we will enter the while loop
         * and then we will assign the arr[j] { 1st index which is 2 } to arr[j+1] {2nd index which is 10} so now the array becomes 0 2 2 10
         * now we will decrement j and it becomes "0" from 1
         * yaha pe j ka value zero ho gaya from one by decrementing j-- aur fir we check the while condition is true for the "j >= 0 &&" ye wala part jo ki true hai par the next part "arr[j] > currentElement" is false
         * kyuki 0 at the 0th index is not greater than 1 which is the currentElement so we will not enter the while loop so the last value of j we GET IS ZERO AND NOT -1
         * and check if arr[j] { 0th index which is 0 } > currentElement which is 1 ( is 0 > 1 ) no so we will not enter the while loop
         * * now we will assign the currentElement which is 1 to arr[j+1] (0+1) { 1st index which is 2 } so now the array becomes 0 1 2 10
         * 
         * so in this way the value of j will decrease and then we check that both the conditions should be true to enter the while loop
         * also the m value will always increase one step ahead and WE COMPARE THE CURRENTELEMENT with the PREVIOUS elements in the array
         *
        */
        for ( int m = 1 ; m < num ; m++){
            int currentElement = arr[m];
            int j = m - 1;
            while ( j >= 0 && arr[j] > currentElement) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentElement;
        }
        // now printing the sorted array
        System.out.println("Sorted array:");
        for ( int p = 0; p < arr.length; p++){
            System.out.print(arr[p] + " ");
        }
        sc.close();
    }
}

