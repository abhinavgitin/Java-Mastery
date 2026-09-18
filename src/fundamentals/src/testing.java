public class testing {
    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println("Please select the operation you want to perform:");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Percentage Calculation");

        int choice = calc.sc.nextInt();
        double result = calc.calculation(choice);
        System.out.println("The result is: " + result);
    }
}