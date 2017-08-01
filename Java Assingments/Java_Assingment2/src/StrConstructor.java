import java.util.Random;

/**
 * Created by zemosozemoso on 29/6/17.
 */
public class StrConstructor {
    StrConstructor(String s) {
        System.out.println(s);
    }
    public static void main (String[] args) {
        Random rand = new Random(47);
        StrConstructor str [] = new StrConstructor[rand.nextInt(10)];
        // rand.nextInt gives a random size(0 to 10) to the array.
    }
}

