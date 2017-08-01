/**
 * Created by zemosozemoso on 28/6/17.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VampireNumbers {
        public static void main(String[] args) {

            List<Integer> vm = new ArrayList<Integer>();
            for (int x = 10; x < 100; x++) { // Four digit vampire numbers formed from 2 digit number.
                String xs = String.valueOf(x);

                for (int y = x; y < 100; y++) {
                    String ys = String.valueOf(y);

                    int v = x * y;
                    String vs = String.valueOf(v);

                    // checking weather x+y string and x*y(v) string have same digits by sorting.
                    if (sortVampire(xs + ys).equals(sortVampire(vs))) {
                        vm.add(v); // collecting the vampire numbers into an array.
                    }
                }
            }
            for (int x = 100; x < 1000; x++) { // 6 digit vampire numbers formed from 3 digit numbers.
                String xs = String.valueOf(x);

                for (int y = x; y < 1000; y++) {
                    String ys = String.valueOf(y);

                    int v = x * y;
                    String vs = String.valueOf(v);

                    // checking weather x+y string and x*y(v) string have same digits by sorting.
                    if (sortVampire(xs + ys).equals(sortVampire(vs))) {
                        vm.add(v); // collecting the vampire numbers into an array.
                    }
                }
            }
            Collections.sort(vm); // Vampire numbers are randomly collected in array, so sorting.
            for (int i = 0; i<100; i++) {
                System.out.println((i+1) + " :" + vm.get(i));
            }
        }
        private static List<Character> sortVampire(String v) {
            List<Character> vc = new ArrayList<Character>();
            for (int j = 0; j < v.length(); j++) {
                vc.add(v.charAt(j));
            }
            Collections.sort(vc); // sorts the given string of numbers.
            return vc;
        }
}

