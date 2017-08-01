import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zemosozemoso on 13/7/17.
 */
public class ExceptionTestTest {
    ExceptionTest et = new ExceptionTest();

    @Test
    public void Test1() {
        assertEquals("Exception 1  Finally block always executs", et.expTest(15));
    }

}