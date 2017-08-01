
/**
 * Exception Handler class with a method that throws all the three Exceptions.
 *
 * Java Day 4 Assingment.
 * @author Manikanta
 * Created by zemosozemoso on 4/7/17.
 */

class ExceptionHandler {
    static void Method(int x) throws Exception1, Exception2, Exception3 {
        if (x > 10) throw new Exception1();
        else if (x < 10) throw new Exception2();
        else if (x == 10) throw new Exception3();
    }
}

