import java.io.File;
import java.security.AccessControlException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class FindPath {
    private int count = 0;
    void filelist(File directory, String expression) throws AccessControlException {

        // Recursivelly searches the directories and prints the path if any match is found.
        try {
            File[] files = directory.listFiles();
            if (files != null) {
                for(File f:files){
                    if(f.isDirectory()) {
                        filelist(f, expression);
                    } else {
                        Pattern pattern = Pattern.compile(expression);
                        Matcher matcher = pattern.matcher(f.getName());
                        if (matcher.find()) {
                            count++;
                            System.out.println(f.getAbsolutePath());
                        }
                    }

                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurs when an access to directory " + directory +" if denied.");
        }
    }

    void done () {
        if (count == 0) {
            System.out.println("No files found for entered expression.");
        } else {
            System.out.println(count + " Matches found");
        }
    }
}