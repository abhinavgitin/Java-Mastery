import java.util.*;
public class arraystest2 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        // this is to transpose a matrix
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transposed matrix is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", arr[j][i]);
            }
            System.out.println();
        }
        sc.close();
    }
}