/**
 * Created by zemosozemoso on 3/7/17.
 */
class Cycle {

}

class Unicycle extends Cycle {
    private String u = "Unicycle";
    public String toString () {return u;}
    void balance () {System.out.println("Balancing the " + this);}

}

class Bicycle extends Cycle {
    private String b = "Bicycle";
    public String toString () {return b;}
    void balance () {System.out.println("Balancing the " + this);}

}

class Tricycle extends Cycle {
    // Balance method not required for tricycle.
    private String t = "Tricycle";
}

public class TestCycleClass {
    public static void main (String[] args) {
        Cycle [] c = new Cycle[3];
        c[0] = new Unicycle();
        c[1] = new Bicycle();
        c[2] = new Tricycle(); // creating instance of three cycles and upcasting them to array of Cycle.

        /* c[0].balance();
           c[1].balance();
           c[2].balance(); This call to method balance is not possible. Because the objects are referenced
                           to Cycle class, and balance method is defined in Cycle class. This will give a compile
                           time error.
           */
        ((Unicycle)c[0]).balance();  // downcasting and calling balance methods.
        ((Bicycle)c[1]).balance();
        // ((Tricycle)c[2].balance(); Not possible, no balance method declared in Tricycle.


    }
}
