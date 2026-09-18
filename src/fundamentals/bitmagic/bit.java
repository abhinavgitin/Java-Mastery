package fundamentals.bitmagic;

import java.io.*;
class bit {
    public static void main (String args []) throws IOException{
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        // Buffered reader class established 
        System.out.println("enter 1 for set operation or enter 2 for the update operation");
        int choice = Integer.parseInt(br.readLine());
        //choice is taken from the user
        System.out.println("Enter the number");
        int number = Integer.parseInt(br.readLine());
        // the number is taken from the user on which the operation is to be performed
        int binarynum = Integer.parseInt(Integer.toBinaryString(number));
        // i converted the string of binary number to the decimal system
        System.out.println("enter the position of the digit you want to change in -> "+binarynum);
        int position = Integer.parseInt(br.readLine());
        // position is taken from the user 
        int length = Integer.toBinaryString(number).length();
        // the length is taken to check the user has given the right position or not
        // now we use the loop to check the position again and again weather it is correct or not
        boolean positionInLength = true;
        while(positionInLength)
        if (position>length){
            System.out.println("Please eneter the valid position as per your binary number"+binarynum);
            position = Integer.parseInt(br.readLine());
            continue;
        }else{
            break;
            // or i can write positionInLength = false;
        }
        // now we creat the bit mask operation 
        int bitMask = 1<<position; // bitMask operation performed;
        int newNumber;
        switch (choice) {
            case 1:
                // the set operation must be performed with the binary or | operator 
                newNumber = bitMask|number;
                System.out.println("your number was "+number+" ->"+binarynum);
                System.out.println("your new number is "+newNumber+" -> "+Integer.parseInt(Integer.toBinaryString(newNumber)));
                break;
            case 2 :
                // the update iperation must be done with the biary compliment ~ and the binary and operator &
                // also known as clear 
                int complimentaryBitMask = ~(bitMask);
                newNumber = complimentaryBitMask&number;
                System.out.println("your number was "+number+" "+binarynum);
                System.out.println("your new number is "+newNumber+" -> "+Integer.parseInt(Integer.toBinaryString(newNumber)));
            default:
                break;
        }

    }
}
