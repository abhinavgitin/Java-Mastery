// public class recursion3 {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int sum = arraySum(arr, arr.length - 1);
//         System.out.println("Sum of array elements: " + sum);
//     }
//     public static int arraySum(int[] arr, int idx) {
//         // code here
//         if (idx < 0) {
//             return 0;
//         }
//         return arr[idx] + arraySum(arr, idx - 1);
//     }
// }
class recursion3 {
    public static void main(String[] args) {
        // Demonstrate recursive sum
        int[] arr = {1, 2, 3, 4, 5};
        int sum = arraySum(arr, arr.length - 1);
        System.out.println("Sum of array elements: " + sum);

        // Demonstrate string permutations
        String str = "abc";
        permutationOfStr(str, "");
    }

    // Recursive sum of array elements
    public static int arraySum(int[] arr, int idx) {
        if (idx < 0) {
            return 0;
        }
        return arr[idx] + arraySum(arr, idx - 1);
    }

    // Print all permutations of a string
    public static void permutationOfStr(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutationOfStr(newStr, permutation + currChar);
        }
        // no return value for void method
    }
}