public class recursion3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = arraySum(arr, arr.length - 1);
        System.out.println("Sum of array elements: " + sum);
    }
    public static int arraySum(int[] arr, int idx) {
        // code here
        if (idx < 0) {
            return 0;
        }
        return arr[idx] + arraySum(arr, idx - 1);
    }
}