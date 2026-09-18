package fundamentals.recursion;

public class RecursiveBinarySearch {

    static void main() {
        int arr[] = {2,3,4,5,6,7,8,9,0,1,11,22,33,44,55,66,77,88,99,100};
        System.out.println(recursiveBinSearch(0, arr.length, 55, arr )+1+ " is the answer");
    }
    static int recursiveBinSearch(int start, int end, int key, int[] arr) {
        int mid = -1;
        if ( start == end ) {
            if ( arr[end] == key ) {
                return end;
            } else {
                return 0;
            }
        } else {
            mid = start + ( end - start ) / 2;
            if (arr[mid] == key){
                return mid;
            } else if (arr[mid] < key){
                return recursiveBinSearch(mid + 1, end, key, arr);
            } else {
                return recursiveBinSearch(start, mid - 1, key, arr);
            }
        }
    }
}

