import org.junit.jupiter.api.Test;

import java.net.UnknownHostException;

/**
 * <h1>Java Assingment 3.</h1>
 * <p>Q. Test cases.</p>
 * @author: Manikanta
 * Created by zemosozemoso on 12/7/17.
 */
public class PingProgramTest {
    @Test
    void Test1() throws Exception {
        PingProgram.command("www.google.com", 3);
    }
    @Test
    void Test2() throws UnknownHostException {
        PingProgram.command("www.yahoo.com", 4);
    }
    @Test
    void Test3() throws UnknownHostException {
        PingProgram.command("www.github.com", 2);
    }

}