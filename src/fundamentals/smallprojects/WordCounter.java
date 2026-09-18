package fundamentals.smallprojects;
import java.util.Scanner;

public class WordCounter {
    // simple program in java to count the total no of the words and characters for the text being written in the window

    public static String takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Enter You text here : ");
        return sc.nextLine().trim();
    }

    private static int getWordsCount(String str ) {
        int wordsCount = 0;
        int length = str.length();
        int i = 0;
        while( i < length-1 ) {
            if ( Character.isWhitespace(str.charAt(i)) && Character.isLetterOrDigit(str.charAt(i-1)) || i == length-1 ) {
                wordsCount++;
            }
            i++;
        }
        return wordsCount;
    }

    private static int getCharacterCount( String str ) {
        return str.length();
    }

    public static void displayWordCount(int wordsCount ) {
        System.out.println("=========================================");
        System.out.println("The Total Number of words in your text is : "+wordsCount+"\n");
    }

    public static void displayCharacterCounts( int characterCounts ) {
        System.out.println("=========================================");
        System.out.println("The Total Number of character in your text is : "+characterCounts+"\n");

    }

    static void main() {
        String str = takeInput();
        displayCharacterCounts(getCharacterCount(str));
        displayWordCount(getWordsCount(str));
    }
}
