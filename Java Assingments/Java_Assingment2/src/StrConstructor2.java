import java.util.Random;
/**
 * Created by zemosozemoso on 29/6/17.
 */
public class StrConstructor2 {
        StrConstructor2(String s) { // constructor that takes string argument.
            System.out.println(s);
        }
        public static void main (String[] args) {
            Random rand = new Random(47);
            StrConstructor2 str [] = new StrConstructor2[rand.nextInt(10)];
            // rand.nextInt gives a random size(0 to 10) to the array.
            for (int i = 0; i < str.length; i++) {
                new StrConstructor2("united"); // creating objects to attach to the array of references.
            }

        }
}

