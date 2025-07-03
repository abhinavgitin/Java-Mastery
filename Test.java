// class Test {
//     public static void main (String args []){

//         int factorial = 1;
//         for (int i = 5 ; i > 0 ; i--){
//             factorial = factorial * i;
//         }
//         System.out.println(factorial);
//     }
// }
// User function Template for Java

// class Solution {
//     public static void main(String[] args) {
//         System.out.println(revStr("abhinav"));
//     }

//     static String revStr(String s) {
//         // code here
//         int length = s.length();
//         int i = 0;
//         String str = "";
//         while (i < s.length() - 1) {
//             str += s.charAt(length);
//             length--;
//             i++;
//         }
//         return str;
//     }
// }
// class Solution {
//     public static void main(String[] args) {
//         System.out.println(isPrime(21));
//     }
//     public static String isPrime(int n) {
//         // code here
//         String str ="";
//         if ( n % 2 == 0){
//             str = "Yes";
//         } else {
//             str = "No";
//         }
//         return str;
//     }
// }

// User function Template for Java
//                                                    this is the demo of the sort 
// class Test {
//     public static void commonElements(int a[], int b[]) {
//         // Your code here
//         int length = 0;
//         if (a.length > b.length) {
//             for (int i = 0; i < a.length; i++) {
//                 for (int j = 0; j < b.length; j++) {
//                     if (a[i] == b[j]) {
//                         length += 1;

//                     }
//                 }
//             }
//         } else {
//             for (int i = 0; i < a.length; i++) {
//                 for (int j = 0; j < b.length; j++) {
//                     if (a[i] == b[j]) {
//                         length += 1;
//                     }
//                 }
//             }
//         }
//         int arr[] = new int[length];

//         if (a.length > b.length) {
//             for (int i = 0; i < a.length; i++) {
//                 for (int j = 0; j < b.length; j++) {
//                     if (a[i] == b[j]) {
//                         arr[i] = b[j];

//                     }
//                 }
//             }
//         } else {
//             for (int i = 0; i < a.length; i++) {
//                 for (int j = 0; j < b.length; j++) {
//                     if (a[i] == b[j]) {
//                         arr[i] = b[j];
//                     }
//                 }
//             }
//         }

//         for (int m = 0; m < arr.length; m++) {
//             for (int n = 0; n < arr.length - m - 1; n++) {
//                 if (arr[n] > arr[n + 1]) {
//                     int temp = arr[n];
//                     arr[n] = arr[n + 1];
//                     arr[n + 1] = temp;
//                 }
//             }
//         }
//         for (int p = 0; p < arr.length; p++) {
//             if (arr[p] != 0) {
//                 System.out.print(arr[p] + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int a[] = { 2, 2, 4, 5, 6, 6, 7 };
//         int b[] = { 2, 2, 6, 6, 7,5,5,4,66,0,3 };
//         commonElements(a, b);

//     }
// }

// import java.util.ArrayList;

// class Solution {
//     public static ArrayList<Integer> commonElements(int a[], int b[]) {
//         int length = 0;
//         if (a.length > b.length) {
//             for (int i = 0; i < a.length; i++) {
//                 for (int j = 0; j < b.length; j++) {
//                     if (a[i] == b[j]) {
//                         length += 1;
//                     }
//                 }
//             }
//         } else {
//             for (int i = 0; i < a.length; i++) {
//                 for (int j = 0; j < b.length; j++) {
//                     if (a[i] == b[j]) {
//                         length += 1;
//                     }
//                 }
//             }
//         }

//         int arr[] = new int[length];

//         if (a.length > b.length) {
//             for (int i = 0; i < a.length; i++) {
//                 for (int j = 0; j < b.length; j++) {
//                     if (a[i] == b[j]) {
//                         arr[i] = b[j];
//                     }
//                 }
//             }
//         } else {
//             for (int i = 0; i < a.length; i++) {
//                 for (int j = 0; j < b.length; j++) {
//                     if (a[i] == b[j]) {
//                         arr[i] = b[j];
//                     }
//                 }
//             }
//         }

//         for (int m = 0; m < arr.length; m++) {
//             for (int n = 0; n < arr.length - m - 1; n++) {
//                 if (arr[n] > arr[n + 1]) {
//                     int temp = arr[n];
//                     arr[n] = arr[n + 1];
//                     arr[n + 1] = temp;
//                 }
//             }
//         }

//         ArrayList<Integer> result = new ArrayList<>();
//         for (int p = 0; p < arr.length; p++) {
//             if (arr[p] != 0) {
//                 result.add(arr[p]);
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int a[] = {2, 2, 4, 5, 6, 6, 7};
//         int b[] = {2, 2, 6, 6, 7, 5, 5, 4, 66, 0, 3};
//         ArrayList<Integer> output = commonElements(a, b);
//         for (int val : output) {
//             System.out.print(val + " ");
//         }
//     }
// }

// class Solution {
//     public static void main(String[] args) {
//         int arrr[]={1,2,3,4,5};
//         System.out.println(average(arrr));
//     }
//     public static String average(int arr[]) {
//         // code here
//         double sum = 0;
//         for ( int i = 0 ; i < arr.length ; i++){
//             sum = sum+arr[i];
//         }
//         double avg = sum / arr.length;
//         String str = avg+"";
//         return str;
//     }
//}

// // User function template for Java
// class Geeks {
//     public static void main(String[] args) {
//         System.out.println(follPatt("xyyx"));
//     }

//     static int follPatt(String s) {
//         // Your code here
//         char first_char = s.charAt(0);
//         char second_char = '\0';
//         if (s.length() == 1) {
//             return 0;
//         } // default value of char
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) != first_char) {
//                 second_char = s.charAt(i);
//                 break;
//             }
//         }
//         if (second_char == '\0')
//             return 0;
//         int countX = 0;
//         int countY = 0;
//         for (int j = 0; j < s.length(); j++) {
//             if (s.charAt(j) == first_char) {
//                 countX++;
//             } else if (s.charAt(j) == second_char) {
//                 countY++;
//             } else {
//                 return 0;
//             }
//         }
//         return countX == countY ? 1 : 0;
//     }
// }
// User function Template for Java
// class Solution {
//     public static void main(String[] args) {
//         square(4);
//     }
//     public static void square(int s) {
//         // Complete the code given below
//         for ( int i = 1 ; i <= s ; i++){
//             for ( int j = 1 ; j <= s ; j++){
//                 if ( i == 1 || i == s || j == 1 || j == s){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
// // Your code here
// if (s1.length() >= s2.length()) {
//     for (int i = 0; i <= s1.length(); i++) {
//         if (i < s2.length()) {
//             if (s1.charAt(i) != (s2.charAt(i))) {
//                 delete++;
//             }
//         }

//     }
//     delete = delete + (s1.length() - s2.length());
// } else {
//     for (int i = 0; i < s2.length(); i++) {
//         if (i < s1.length()) {
//             if (s1.charAt(i) != (s2.charAt(i))) {
//                 delete++;
//             }
//         }
//     }
//     delete = delete + (s2.length() - s1.length());
// }

// return delete;
class Test {

    public static void main(String[] args) {
        System.out.println(coutChars(
                "abhinav",
                "dniciuehstodlqxhhcydvccfpbbpmwpmpxurkuxtrfdpencvkvxvs"));
    }

    public static int coutChars(String s1, String s2) {
        int char1[] = new int[26];
        int char2[] = new int[26];
        
        for ( char c : s1.toCharArray()){
            char1[c-'a']++;
        }
        for ( char c : s2.toCharArray()){
            char2[c-'a']++;
        }
        int deletation =  0;
        for ( int i = 0 ; i < 26 ; i++){
            deletation+= Math.abs(char1[i]-char2[i]);
        }
        return deletation;
        // todays work is done

    }
}
