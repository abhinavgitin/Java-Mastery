// public class recursion2 {
//     public static void main(String[] args) {
//         towerOfHanoi(3, "Source", "helper", "Destination");
//     }
//     public static void towerOfHanoi(int disks , String src , String helper , String destination){
//         if  ( disks == 1 ){
//             System.out.println("transfer of disk "+disks+" from "+src+" to "+destination);
//             return;
//         }
//         towerOfHanoi(disks-1, src, destination, helper); // source se helper tak le jana hai
//         System.out.println("transfer of disk "+disks+" from "+src+" to "+destination);
//         towerOfHanoi(disks-1, helper, src, destination);
//         return;
//     }
// }
// class recursion2 {
//     // time complexity = O(n) where n is the length of the string
//     public static void main(String[] args) {
//         reverseStr("Abhinav", 0);
//     }

//     public static void reverseStr(String str , int index) {
//         if ( str.length()-1 == index ){
//             System.out.print(str.charAt(index));
//             return;
//         }
//         reverseStr(str, index+1);
//         System.out.print(str.charAt(index));
//     }
// }
// first and the last occurance

// class recursion2 {
//     public static int first = -1;
//     public static int last = -1;

//     public static void main(String[] args) {
//         occurance("aabbcctteaaab", 0, 'b');

//     }

//     public static void occurance(String str, int index, char chr) {
//         if (index == str.length()) {
//             System.out.println("first occurance : " + first + " and the last occurance : " + last);
//             return;
//         }
//         if (str.charAt(index) == chr) {
//             if (first == -1) {
//                 first = index;
//             } else {
//                 last = index;
//             }
//         }
//         occurance(str, index + 1, chr);
//     }
// }

// class recursion {
//     public static int first = -1 ;
//     public static int last = -1 ;

//     public static void main(String[] args) {
//         reoccurance("abhinav", 'a', 0);
//         System.out.println("the first occurance if the char "+(first+1)+" and the last occurance is "+(last+1));
//     }
//     public static void reoccurance (String str , char chr , int index){
//         if ( str.length()-1 == index){
//             return;
//         }
//         if ( first == -1 ){
//             first = index;
//         } else {
//             last = index;
//         }
//         reoccurance(str, chr, index+1);
//     }
// // }

// class recursion {
//     public static StringBuilder tempx = new StringBuilder();
//     public static StringBuilder tempstr = new StringBuilder();
//     public static void main ( String args []){
//         shiftChar("axxaaxabhi", 'x', 0);
//     }
//     public static void shiftChar( String str , char chr , int index){

//         if ( str.length() == index){
//             System.out.println(tempstr+""+tempx);
//             return;
//         }
//         if ( str.charAt(index) == chr){
//             tempx.append(str.charAt(index));
//         } else {
//             tempstr.append(str.charAt(index));
//         }

//         shiftChar(str, chr, index+1);
//     }
// }

// class recursion2 {
//     public static void main ( String args []){
//         int arr[] = {1,2,3,4,33,44,55,55};
//         System.out.println(checksort(arr, 0));
//     }
//     public static boolean checksort( int arr[] , int index ){
//         if ( arr.length-1 == index ){
//             return true;
//         }
//         if ( arr[index] >= arr[index+1]){
//             return false;
//         }
//         return checksort(arr, index+1);
//     }
//}
// class recursion2 {
//     public static StringBuilder newStr = new StringBuilder();

//     public static void main(String[] args) {
//         boolean map[] = new boolean[26];
//         removeStr("aabhinnavvppuriii", map, 0);
//     }

//     public static void removeStr(String str, boolean map[], int index) {
//         if (str.length() == index) {
//             System.out.println(newStr);
//             return;
//         }
//         char currentChar = str.charAt(index);
//         if (map[currentChar - 'a'] == false) {
//             newStr.append(currentChar);
//             map[currentChar - 'a'] = true;
//             removeStr(str, map, index + 1);
//         } else {
//             removeStr(str, map, index + 1);
//         }
//     }
// }
// class recursion2 {
//     public static void main(String[] args) {
//         subsequesces("abc", 0, "");
//     }
//     public static void subsequesces ( String str, int index , String newStr){
//         if (str.length() == index){
//             System.out.println(newStr);
//             return;
//         }
//         char currentChar = str.charAt(index);
//         subsequesces(str, index+1, newStr+currentChar); // 1st wala
//         subsequesces(str, index+1, newStr); // 2nd wala
//     }
// }
class recursion2 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(towerOfHanoi(n, 0, 0, 0));
    }
    public static int towerOfHanoi(int n, int source, int destination, int helper) {
        // code here
        // if ( n == 1 ) return 1;
        // if ( n == 0 ) return 0;
        if ( n == 1 ){
            // System.out.println("move disk "+n+" from rod "+source+" to rod "+destination);
            return 1;
        }
        int steps = 0;
        steps += towerOfHanoi( n - 1 , source , helper , destination );
        // System.out.println("move disk "+n+" from rod "+source+" to rod "+destination);
        steps++;
        steps += towerOfHanoi( n - 1 , helper , destination , source );
        return steps;
    }
}