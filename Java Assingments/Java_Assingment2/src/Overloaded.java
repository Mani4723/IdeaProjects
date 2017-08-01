/**
 * Created by zemosozemoso on 28/6/17.
 */
public class Overloaded {
    String str = "Initial string";
    Overloaded () {
    this ("Second Constructor"); // calling second constructor inside first.
    System.out.println(str + " called inside the First");
    }
    Overloaded (String s) {
        //overloaded constructor
        str = s;
        System.out.println("Inside the " + str);
    }

    public static void main (String[] args) {
        new Overloaded();
    }
}

