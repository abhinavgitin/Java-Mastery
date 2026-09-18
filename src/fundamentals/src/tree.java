class tree {
    public static void main(String args[]) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print(" ");
            }
            for (int t = 1; t <= i * 2; t++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int s = 1; s <= 5; s++) {
            for (int ss = 1; ss <= 7; ss++) {
                System.out.print(" ");
            }
            System.out.print("**\n");
        }
    }
}
