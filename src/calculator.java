import java.util.*;

class calculator {
    public int input, first_num, second_num;
    double output;
    public Scanner sc = new Scanner(System.in); // created method for taking input

    public int takinginput() { // taking input for what the user wants
        input = sc.nextInt();
        return input;
    }

    public int numbers1() { // taking the numbers from the user for the respective operation
        System.out.println("enter the the first number");
        first_num = sc.nextInt();
        return first_num;
    }

    public int numbers2() { // taking the numbers from the user for the respective operation
        System.out.println("enter the next number");
        second_num = sc.nextInt();
        return second_num;
    }

    public double calculation(int num) {
        int tempnum1 = numbers1();
        int tempnum2 = numbers2();
        switch (num) {
            case 1:
                System.out.println("you choosed the + type"); // this is the + type calc
                output = tempnum1 + tempnum2;
                break;
            case 2:
                System.out.println("you choosed the - type"); // this is the - type calc
                output = tempnum1 - tempnum2;
                break;
            case 3:
                System.out.println("you choosed the * type"); // this is the * type calc
                output = tempnum1 * tempnum2;
                break;
            case 4:
                System.out.println("you choosed the / type"); // this is the / type calc
                if (tempnum1 != 0 && tempnum2 != 0) {
                    if (tempnum1 > tempnum2) {
                        // res.tempnum1 becomes the numerator and res.tempnum2 becomes the denominator
                        output = tempnum1 / tempnum2;
                    } else {
                        // res.tempnum1 becomes the denominator and res.tempnum2 becomes the numerator
                        output = tempnum2 / tempnum1;
                    }
                } else {
                    System.out.println("cannot be divided by zero");
                }
                break;
            case 5:
                System.out.println("you choosed the per type"); // this is the percentage type calc
                System.out.println("enetr the obtained  value");
                double obtainedVal = sc.nextDouble();
                System.out.println("enter the total value");
                double totalVal = sc.nextDouble();
                if (totalVal != 0) {
                    output = (obtainedVal / totalVal) * 100;
                } else {
                    System.out.println("total value cannot be zero");
                }
                break;

            default:
                System.out.println("invalid option answer again");
                main(null);
                break;
        }
        return output;
    }

    public static void main(String args[]) {
        calculator  call = new calculator();
        System.out.println("enter 1 for addition");
        System.out.println("enetr 2 for subtraction");
        System.out.println("enetr 3 for multiplication");
        System.out.println("enter 4 for division");
        System.out.println("enter 5 for percentage calc");
        int ans = call.takinginput();
        double finalans = call.calculation(ans);
        System.out.println("your final answer is : " + finalans);
        // when an operation is unsuccessful the the final answer will be the default
        // value of double which is 0.0
    }
}