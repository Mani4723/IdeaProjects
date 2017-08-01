import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by zemosozemoso on 16/7/17.
 */
public class CharacterCountMain {
    public static void main (String[] args) throws IOException, IndexOutOfBoundsException {
        if(args.length == 0) {
            System.out.println("Enter the file name: ");
        }
        FileWriter out = null;

        try {
            File inputFile = new File(args[0]);

            if (inputFile.exists()) {

                CharacterCount count = new CharacterCount();
                //creates an output file and writes to it.
                out = new FileWriter("Output.txt");
                out.write(String.valueOf(count.counting(inputFile)));

            } else {
                System.out.println("Given file " + inputFile + " does not exists. ");
            }

        } catch (IOException e) {
            System.err.println("Occurred by failed or interrupted I/O operations.");
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Arguments are not passed, Index Out Bound Exception occurred.");
        } finally {
            if (out != null) {
                out.close();
            }
        }

    }
}
