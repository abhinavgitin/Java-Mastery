package fundamentals.matrix;

class Matrix {
    public static void main(String args[]) {
        int matrix[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 },
            { 22, 56, 100 }
        };
        System.out.println("Number of rows: " + matrix.length);
        System.out.println("Number of columns: " + matrix[0].length);
    }
}
