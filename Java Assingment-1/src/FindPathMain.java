import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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

public class FindPathMain {

    public static void main(String[] args) throws IOException {

        FindPath path;

        try (Scanner scan = new Scanner(System.in)){
            Path startPath = Paths.get(System.getProperty("user.home"));
            File directory = new File(String.valueOf(startPath));

            System.out.print("Enter an Expression to search the files that match : ");

            // Continuously takes the inputs until exit is typed.
            while (!scan.hasNext("exit")) {
                path = new FindPath();
                String filename = scan.next();
                System.out.println(path.searchFile(directory, filename));
                System.out.println("--------------------------------------------");
                System.out.print("Try another expression or exit by typing 'exit' : ");
            }

        } catch (NullPointerException e) {
            System.out.println("Occurs when no file with given expression is found.");
        }

    }

}