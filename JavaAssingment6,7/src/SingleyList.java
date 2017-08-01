/**
 *
 * Created by zemosozemoso on 6/7/17.
 */

public class SingleyList {
    public static void main(String[] args) {
        SList<String> slist = new SList<>();
        System.out.println(slist);
        SListIterator<String> slIter = slist.Iterator(); // creates a SListItertor object.

        slIter.add("one");
        System.out.println(slist);
        System.out.println("Length of the list: " + slIter.count);
        slIter.add("two");
        System.out.println(slist);
        System.out.println("Length of the list: " + slIter.count);
        slIter.add("three");
        System.out.println(slist);
        System.out.println("Length of the list: " + slIter.count);

        slIter.add("five", 3);
        System.out.println(slist);
        System.out.println("Length of the list: " + slIter.count);
        slIter.add("six", 4);
        System.out.println(slist);
        System.out.println("Length of the list: " + slIter.count);

        slIter.remove(2);
        System.out.println(slist);
        System.out.println("Length of the list: " + slIter.count);
        slIter.remove(0);
        System.out.println(slist);
        System.out.println("Length of the list: " + slIter.count);
        slIter.remove(5);
        System.out.println(slist);
        System.out.println("Length of the list: " + slIter.count);

        slIter.remove();
        System.out.println(slist);
        System.out.println("Length of the list: " + slIter.count);
        slIter.remove();
        System.out.println(slist);
        System.out.println("Length of the list: " + slIter.count);
        slIter.remove();
        System.out.println(slist);
        System.out.println("Length of the list: " + slIter.count);
        slIter.remove();
        System.out.println(slist);
        System.out.println("Length of the list: " + slIter.count);
    }
}
