import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

/**
 * Test cases for Java Assignment 1.
 * @author Manikanta
 * Created by zemosozemoso on 17/7/17.
 */
public class FindPathTest {
    private FindPath testFilePath = new FindPath();
    private Path startPath = Paths.get(System.getProperty("user.home"));


    @Test
    public void filelist () throws Exception {
        assertTrue("Should return true for codeconventions",
                testFilePath.searchFile(new File(String.valueOf(startPath)), "codeconvention"));

        assertFalse("Should return false for varun",
                testFilePath.searchFile(new File(String.valueOf(startPath)), "varun"));
    }



}