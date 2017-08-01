import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Question: Create an java program to search through the home directory and look for files that match a
 * regular expression. The program should be able to take inputs repeatedly and should print out full
 * absolute path of the matching files found.
 *
 * Java Assingment 1
 * @author Manikanta
 * Created by zemosozemoso on 14/7/17.
 */

public class FindPathtMain {

    public static void main(String[] args) throws IOException {
        Scanner scan = null;
        FindPath path = new FindPath();
        try {
            scan = new Scanner(System.in);
            System.out.print("Enter an Expression to search the files that match : ");

            // Continuously takes the inputs until exit is typed.
            while (!scan.hasNext("exit")) {
                String filename = scan.next();
                path.filelist(new File("/home"), filename);
                System.out.println();
                path.done();
                System.out.print("Try another expression or exit by typing 'exit' : ");
            }

        } catch (Exception e) {
            System.err.println("An error occurred with I/O. Please check the input.");
        } finally {
            if (scan != null) {
                //Done with underlying stream.
                scan.close();
            }
        }

    }
}