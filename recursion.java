// class recursion {
//     public static void main(String args[]) {
//         int number = 0;
//         printnumb(number);
//     }

//     public static void printnumb(int n) {
//         if (n == 6) // base case
//         // base case is the condition which will stop the recursion
//         // if we don't have a base case then it will go into infinite loop
//         // and stack overflow error will occur
//         // so we need to have a base case to stop the recursion
//         {
//             System.out.println("Base case reached");
//             return; // this will stop the recursion
//         }

//         System.out.println(n);
//         printnumb(n + 1); // 4 aaapna issi function me chala jayega
//         // appna hi function me hoke aapne aapko call karna hai
//     }
// } 
// import java.util.*;

// class recursion {

//     public static void printSum ( int start , int end , int sum){
//         if ( start == end ){
//             sum+=start;
//             // kyuki tab tak start aapna end number tak ho gaya hoga so we need to add the last number too!
//             System.out.println("The sum is : "+sum);
//             return;
//         }
//         sum += start;
//         printSum(start, end, sum);
//     }

//     public static void main (String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number ");
//         int endNumber = sc.nextInt();
//         printSum(1, endNumber, 0);
//         sc.close();
//     }
// }

// factorial part  the actual explanation is given in the copy 
// class recursion {
//     public static int calcFactorial(int num) {
//         if (num == 1 || num == 0) {
//             return 1;
//         }
//         /*                                                                this is the first step 
//          *we run the function calcFactorial and what happens is that when we pass the num to be 5 in the parameter the num =5 
//          * the if statements runs num[5]==1 which is false and thus we proceed 
//          * to the next line which is *int factorialm1 = calcFactorial(num - 1);* so in this part the function grts called again but this time the parameter will be num-1 (5-1)=4
//          * and thus we have  num = 5 the paremeter passed = 4 
//          *                                                                 this is the second step 
//          * the if statements runs num[4]==1 which is false and thus we proceed 
//          * to the next line which passes the parameter to be num - 1 which is 4-1 =3 
//          * so for this part we have the num 4 and the parameter passed is 3 
//          *                                                                  this is the third step
//          * the if statements runs num[3]==1 which is false and thus we proceed 
//          * to the next line which passes the parameter to be num - 1 which is 3-1 =2
//          * so for this part we have the num 3 and the parameter passed is 2
//          *                                                                   this is the fourth step
//          * the if statements runs num[2]==1 which is false and thus we proceed 
//          * to the next line which passes the parameter to be num - 1 which is 2-1 =1
//          * so for this part we have the num = 2 and the parameter passed is 1
//          *                                                                   this is the fifth step
//          * now the condition results true 'cause 1==1 and thus it returns the value 1 to the function *calcFactorial*
//          * **what return will dois it will reverse the way we came towards** 
//          * there fore we have calcFactorial = 1 which then gets into factorialm1 = 1 and the num = 1 
//          * so  now we get into the line * int ans = num * factorialm1; * where the ans becomes 1*1 = 1 and it gets passed into the *public static int calcFactorial(int num)* function 
//          * there for we have the num = 1 the factorialm1 = 1 and the calcFactorial = 1  ** and thus we keep on reversing back now*
//          *                                                                   this is the sixth step
//          * the num was 2 earlier to 1 therefore the ans becomes num * factorialm1 [2*1(1 is the previous value of the factorialm1)] 
//          * thus ans = 2 is now returned to the function calcFactorial
//          * therefore we have calcFactorial = 2 = factorialm1 the num = 2 
//          *                                                                    this is seventh step
//          * the num was 3 earlier to 2 therefore the ans becomes num * factorialm1 [3*2(1 is the previous value of the factorialm1)] 
//          * thus ans = 6 is now returned to the function calcFactorial
//          * therefore we have calcFactorial = 6 = factorialm1 the num = 3
//          *                                                                    this is the eigth step
//          * the num was 4 earlier to 3 therefore the ans becomes num * factorialm1 [4*6(1 is the previous value of the factorialm1)] 
//          * thus ans =24 is now returned to the function calcFactorial
//          * therefore we have calcFactorial = 24 = factorialm1 the num = 4
//          *                                                                     this is the nineth step
//          * the num was 5 earlier to 4 therefore the ans becomes num * factorialm1 [5*24(1 is the previous value of the factorialm1)] 
//          * thus ans =120 is now returned to the function calcFactorial
//          * therefore we have calcFactorial = 120 = factorialm1 the num = 5
//          * now science we started with 5 we dont have the next value and thus the and = 120 = calcFactorial gets returned to the main function and it gets printed
//          */
//         int factorialm1 = calcFactorial(num - 1);
//         int ans = num * factorialm1;
//         return ans;

//     }
//     public static void main(String[] args) {
//         System.out.println(calcFactorial(4));
//     }
// }

// class recursion {
//     // this is tp print the fibonacci series which goes like 0 1 1 2 3 5 8 13 and so
//     // on this shows that we need to add the previous two numbers
//     public static void fibo ( int start , int previousToPrevious, int n){
//         if (n==0)
//         return;
//         // if the number reaches 0 on desercing then it returns;
//         int justPrevious = start+previousToPrevious;
//         System.out.println(justPrevious);
//         // it is like if start = 0 and previoustoprevious = 1 then the justPrevious = 1 and thus it becomes 0 1 "1" this one is printed out here 
//         // now we need to add the last two numbers which is the "1 1" where the first 1 was previousToPrevious and the second 1 was justPrevious so we give the parametres like 
//         //
//         fibo(previousToPrevious,justPrevious,n-1);
//     }

//     public static void main(String args[]) {
//         int a = 0, b = 1;
//         System.out.println(a);
//         System.out.println(b);
//         int n = 47;
//         fibo(a, b, n -2);

//     }
// }

// class recursion {

//     public static int stackHeight ( int x ,  int n){
//         // base case
//         if ( n == 0 ){
//             return 1;
//         }
//         if ( x == 0 ){
//             return 0; // user x ko 0bhi de sakta hai!
//         }
//         int calcpowm1 = stackHeight(x, n-1);
//         int xpown = x * calcpowm1;
//         return xpown;
//     }

//     public static void main ( String args[] ){
//         // this is to print the x to the power n (x^n) where n is the height of the stack
//         int x = 2;
//         int n = 5;
//         System.out.println(stackHeight(x, n));

//     }
// }

// class hanoiTower {
//     public static void main(String[] args) {
//         int n = 3;
//         secToDes(n,"source","helper","destination");
//     }
//     public static void secToDes( int n , String src , String helper , String destination ){
//         if ( n == 1 ){
//             System.out.println("transfer of disk "+n+" from "+src+" to "+destination);
//             return;
//         }   
//         secToDes(n-1, src, destination, helper);
//         System.out.println("transfer of disk "+n+" from "+src+" to "+destination);
//         secToDes(n-1, helper, src, destination);
//     }
// }
// class reverse {
//     public static void main(String[] args) {
//         String name = "abhinavworks";
//         stringRev(name, name.length() - 1);
//     }

//     public static void stringRev(String str, int index) {
//         if (index == 0) {
//             System.out.println(str.charAt(index));
//             return;
//         }

//         System.out.print(str.charAt(index));
//         stringRev(str, index - 1);
//     }
// }

// class recursion {
//     public static void main(String[] args) {
//         printsum(1 , 5, 0);
//     }
//     public static void /* or int */ printsum( int i , int n , int sum ){
//         if ( i == n ) {
//             sum = sum + i;
//             System.out.println("your sum is "+sum);
//             return;
//         }
//         sum = sum + i;
//         printsum( i+1 , n , sum );
//         System.out.println(sum);
        
//     }
// }
// class recursion {
//     public static void main (String[] args ){
//         System.out.println(factorial(5));
//     }
//     public static int factorial ( int n ) {
//         if ( n == 1 || n == 0){
//             return 1;
//         }
        
//         int factorialm1 = factorial(n-1);
//         int ans = factorialm1*n;
//         return ans;
        
//     }
// }
// class recursion {
//     public static void main ( String args []){
//         int a = 0;
//         int b = 1;
//         System.out.print(a+" ");
//         System.out.print(b+" ");
//         printfibo(a, b , 13 - 2);
//     }
//     public static void printfibo(int a , int b , int n ){
//         if ( n == 0 ){
//             return;
//         }
//         // kaam 
//         int c = a + b;
//         System.out.print(c +" ");
//         printfibo(b, c, n-1);

//     }
// }
// class recursion {
//     public static void main (String args []){
//         System.out.println(stackHeight(5, 5));
//     }
//     public static int stackHeight(int n , int x){
//         if (x == 0 ){
//             return 0;
//         }
//         if ( n == 0 ){
//             return 1;
//         }
//         int powerMinus1 = stackHeight(n-1, x); // ye wala jate rahega 
//         // aur jab wapas aayega tab 
//         /*  5*1 = 5
//             5*5 = 25 
//             5*25 = 125
//             5*125 = 625
//             5*625 = 3125
//          */
//         int xpower = x*powerMinus1;
//         return xpower;

//     }
// }
