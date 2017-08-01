import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by zemosozemoso on 14/7/17.
 */
public class PathTester {
    public static void main(String[] args) throws IOException {
        Scanner scan = null;

        try {
            scan = new Scanner(System.in);
            System.out.print("Enter the file name to search the path or exit by typing 'exit' : ");
            while (!scan.hasNext("exit")) {
                String filename = scan.next();
                System.out.print("Enter the directory name: ");
                String dir = scan.next();  // Directory name, where we want to search the files.
                Path directory = Paths.get(dir);
                PathFinder(filename, directory);

                System.out.println();
                System.out.println("Enter the file name to search the path or exit by typing 'exit' : ");
            }
        } finally {
            if (scan != null) {
                scan.close();
            }
        }
    }

    private static void PathFinder(String filename, Path directory) throws IOException {
        FileSystem fs = FileSystems.getDefault();
        final PathMatcher matcher = fs.getPathMatcher("glob:" + filename);

        FileVisitor<Path> matcherVisitor = new SimpleFileVisitor<Path>() {
            int numMatches = 0;
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

                Path name = file.getFileName();
                if (matcher.matches(name)) {
                    numMatches++;
                    System.out.println(String.valueOf(file));
                }
                return FileVisitResult.CONTINUE;
            }
        };
        Files.walkFileTree(directory, matcherVisitor);


    }
}

