public class recursion3 {
    public static void main(String[] args) {
        printingnums(5);
    }
    public static void printingnums (int n ){
        if (n >= 1000){
            return;
        }
        System.out.println(n);
        printingnums(n+9);
    }
}