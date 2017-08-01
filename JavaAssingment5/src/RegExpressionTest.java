import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zemosozemoso on 18/7/17.
 */
public class RegExpressionTest {

    @Test
    public void expCheck() throws Exception {
        assertTrue("This test case is true.", RegExpression.expCheck("The is true."));
        assertFalse(" this testcase is false", RegExpression.expCheck("this is false"));
        assertFalse("this testcase is false", RegExpression.expCheck("Start with capital but no period"));
    }

}