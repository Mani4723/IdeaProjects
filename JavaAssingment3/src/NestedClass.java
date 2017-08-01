/**
 * Created by zemosozemoso on 3/7/17.
 */
class OuterClass1 {
    class InnerClass1 {
        InnerClass1(String str) {  // Inner class with an argument.
            System.out.println(str);
        }
    }
}

class OuterClass2 {
    class InnerClass2 extends OuterClass1.InnerClass1 { //Second inner class that inherits from first inner class
        InnerClass2(OuterClass1 oc1, String s) {
            oc1.super(s);
        }

    }
}

public class NestedClass {
    public static void main (String[] args) {
        OuterClass1 oc1 = new OuterClass1();
        OuterClass2 oc2 = new OuterClass2();
        OuterClass2.InnerClass2 in2 = oc2.new InnerClass2(oc1, "Inside InnerClass1.");
    }
}
