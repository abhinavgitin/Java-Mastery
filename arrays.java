import java.util.*;

class arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows for the matrix");
        int rows = sc.nextInt();
        System.out.println("Enter the columns for the matrix");
        int clo = sc.nextInt();
        // 2 d array initialisation
        int[][] matrix = new int[rows][clo];

        // taking input
        // for the rows first the outer loop
        for (int i = 0; i < rows; i++) {
            // for the columns in the inner loop
            System.out.println("enter the data for the row " + (i + 1));
            for (int j = 0; j < clo; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("enetr the data needed to be searched ");
        int element = sc.nextInt();

        boolean found = false; // to search weather we got the target as per our requirement or not we will use
                               // the boolean operation always

        for (int m = 0; m < rows; m++) {
            for (int n = 0; n < clo; n++) {
                if (matrix[m][n] == element) {
                    System.out.println("data found at row " + (1 + m) + " and column at " + (1 + n));
                    found = true;
                    // break ;
                    // add this if you want to just find the first occurence;
                } else {
                    continue;
                }
            }
        }
        if (!found) {
            // i guess this is the best way to write a counditional statement
            System.out.println("not found ");
        }
        for (int i = 0; i < rows; i++) {
            // for the rows nesting
            for (int j = 0; j < clo; j++) {
                // this is for the cloumns nesting
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}