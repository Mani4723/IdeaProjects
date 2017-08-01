import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <h1>Java Assingment 2 </h1>
 * <p>Question: Write a java function that checks if the input string contains all the letters
 *    of the alphabet a-z (case-insensitive).
 * </p>
 * @author: Manikanta
 * Created by zemosozemoso on 7/7/17.
 */

public class Alphabets {
    public static void main(String[] args) {
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Some text, this program will check if it contains all the alphabets: ");
        while (!scan.hasNext("exit")) {
            input = scan.nextLine();
            allAlphas(input);
            System.out.println("Check another or type exit : ");
        }
        scan.close();
    }

    /**
     * @param input Given input text, taken as a string.
     */
    public static void allAlphas(String input) {
        Set<Character> set = new HashSet<>();

        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(c))
                set.add(c);
        }
        if (set.size() == 26)
            System.out.println("You're text contains all the alphabets.");
        else
            System.out.println("No, You're text does not contain all the alphabets.");

        System.out.println();

    }
}
