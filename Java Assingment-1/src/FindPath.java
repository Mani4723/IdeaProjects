import java.io.File;
import java.security.AccessControlException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Java Assingment 1
 * @author Manikanta
 * Created by zemosozemoso on 14/7/17.
 */
class FindPath {
    private int count;

    /**
     * For searching the multiple times. Ensures that count will be assigned to 0 before every search.
     * @param directory Contains the directory name in which given expression will be looked.
     * @param expression  Given input expression to search matching files.
     * @return Returns true if any file names matches the given expression else false.
     */
    public boolean searchFile(File directory, String expression){
        count = 0;
        if(filelist(directory, expression)){
            System.out.println("Found");
            return true;
        }else{
            System.out.println("Not Found");
            return false;
        }
    }

    /**
     * Recursively searches the directories and prints the paths if any matches are found.
     * @param directory Contains the directory name in which given expression will be looked.
     * @param expression Given input expression to search matching files.
     * @throws AccessControlException Throws when a directory permissions are denied.
     * @return Returns true if any file names matches the given expression else false.
     */
    private boolean filelist(File directory, String expression) {

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
        } catch (AccessControlException e) {
            System.out.println("Exception occurs when an access to directory " + directory +" if denied.");
        }
        return count > 0;
    }
}
