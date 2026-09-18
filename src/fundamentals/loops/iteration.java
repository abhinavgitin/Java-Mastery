package fundamentals.loops;

import java.util.*;
class iteration {
    public static void main (String args []){
        // loops in java 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the hollow box pattern");
        int length = sc.nextInt();
        System.out.println("enter the breath of the hollow box pattern");
        int breath = sc.nextInt();
        for ( int i = 1 ; i <= length ; i++){
            // nested loops 
            for ( int j = 1 ; j <= breath ; j++){
                if ( i == 1  || i == length || j == 1 || j == breath ){ // koi ek ko true hona padega 
                    /* if any of the condition with the or operator is tre the next line will get executed */
                System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    /* concept was that the hollow box has the star printed at the edges only which is either the length 
     * the breath or it is equal to the number 1 from where the process and priniting starts 
     */
}

