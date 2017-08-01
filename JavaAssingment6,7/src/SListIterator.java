/**
 *
 * Java Assingment Day 7
 * Created by zemosozemoso on 20/7/17.
 */
class SListIterator<T> { // Creating iterator. With basic methods.
    int count = 0;
    private SNode<T> current;
    SListIterator(SNode<T> link) {
        current = link;
    }

    /**
     * Checks if next node present or null in forward direction.
     * @return Returns true if given node has next link/node.
     */
    boolean hasNext() {
        return current.next != null;
    }

    /**
     * Used to traverse to the next link/node.
     * @return Return the pointer to next node.
     */
    SNode<T> next() {
        current = current.next;
        return current;
    }

    /**
     * Adds the given data value at the end of the list.
     * @param data The data to be stored in Node.
     */
    void add(T data) {
        SNode<T> temp = current;

        if (temp == null) {
            temp = new SNode<T>(data);
        } else {
            while (temp.next != null) temp = temp.next;

            SNode<T> newTemp = new SNode<T>(data);
            temp.next = newTemp;
        }
        count++;
    }

    /**
     * Adds a new node at given index and stores the data in that node.
     * @param data The data/value to be stored in the Node.
     * @param index The index of list where the data needs to be stored/Index where new Node is created.
     */
    void add(T data, int index) {
        SNode<T> temp = current;
        try {

            if (temp == null || index > count) {
                throw new IndexOutOfBoundsException();
            } else if (index == 0) {
                SNode<T> newTemp = new SNode<T>(data, current);
                current = newTemp;
                count++;
            } else {
                for (int i = 0; i <= index - 1; i++)
                    temp = temp.next;
                SNode<T> newTemp = temp.next;
                temp.next = new SNode<T>(data, newTemp);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out of Bound Exception occurred. Given index is greater " +
                    "then length of list.");


        }

    }

    /**
     * Removes a node at the end of list.
     */
    public void remove () {
        SNode<T> temp = current;

        try {
            if (temp == null) {
                System.out.println("Empty list, cannot remove anything.");
            } else {
                while (temp.next.next != null)
                    temp = temp.next;
                temp.next = null;
                count--;
            }
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception occurred. Your list might be empty or You" +
                    " might be transversing beyond null.");
        }
    }


    /**
     * Removes the Node at given index.
     * @param index Represents the index number of Node which will be removed.
     */
    void remove (int index) {
        SNode<T> temp = current;

        try {
            if (current == null) {
                System.out.println("Empty list, cannot remove anything.");
            }
            if (index > count) {
                System.out.println("Given index is out bound. Index number should be less " +
                        "then the length of list");
            } else if (index == 0) {
                SNode<T> newTemp = temp.next;
                temp.next = newTemp.next;
                count--;
            } else {
                for (int i = 0; i < index; i++)
                    temp = temp.next;
                SNode<T> newTemp = temp.next;
                temp.next = newTemp.next;
                count--;
            }

        } catch (Exception e) {
            System.out.println("Index Out of Bound Exception occurred. Given index is greater " +
                    "then length of list.");
        }
    }
}