import java.lang.*;

/**
 * Question: Create three new types of exceptions. Write a class with a method that throws all
 * three. In main( ), call the method but only use a single catch clause that will catch all
 * three types of exceptions. Add a finally clause and verify that your finally clause is
 * executed, even if a NullPointerException is thrown.
 *
 * Java Day 4 Assingment.
 * @author Manikanta
 * Created by zemosozemoso on 4/7/17.
 */

public class ExceptionTest {

    /**
     * @param i Integer given from main, Used to create a condition that shows the Exception type thrown.
     */
    void expTest(int i) {
        try {
            if (i > 0) {
                ExceptionHandler.Method(i);
            } else {
                throw new NullPointerException();
            }
        } catch (Exception e) { /* Only single catch block to catch all types of exception.*/
            System.out.print(e.getMessage());

            /*prints the thrown exception type and its backtrace to the standard error stream.*/
            e.printStackTrace();
        } finally {
            System.out.println("  Finally block always executes");
        }
    }

    public static void main (String[] args) {
        ExceptionTest exp = new ExceptionTest();
        exp.expTest(15);
        exp.expTest(8);
        exp.expTest(10);
        exp.expTest(-12); // Catches null point exception
    }
}

