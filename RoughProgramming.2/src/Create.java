import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by zemosozemoso on 14/7/17.
 */
public class Create {
    public static void main (String[] args) {
        File file = new File("new_unique_file.txt");
        System.out.println(file.getAbsolutePath());
    }
}
