import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zemosozemoso on 5/7/17.
 */

public class RegExpression {
    static boolean expCheck(String s){
        Pattern p = Pattern.compile("[A-Z].*\\.$");
        Matcher m = p.matcher(s);
        return m.find();
    }

    public static void main (String[] args) {

        String s;
        System.out.println("Enter a sentence to check if it begins with capital letter and ends with period.");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNext("exit")) {
            s = scan.nextLine();
            System.out.println(expCheck(s));
            System.out.print("Try another sentence or type 'exit' : ");
        }
        scan.close();

    }
}
