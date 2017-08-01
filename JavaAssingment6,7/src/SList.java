/**
 *
 * Created by zemosozemoso on 20/7/17.
 */
class SList<T> {
    int count = 0;
    public SNode<T> HeadNode = new SNode<T>(null); // Initializing a Head node.

    SListIterator<T> Iterator() {
        return new SListIterator<T>(HeadNode);
    }

    /**
     * Used to print the list.
     * @return Returns the List in String form.
     */
    public String toString() {
        if(HeadNode.next == null) return "Empty list.";
        SListIterator<T> sliterator = this.Iterator();
        StringBuilder s = new StringBuilder(); /* Used to append strings to string builder. */
        while(sliterator.hasNext()) {
            s = s.append(sliterator.next() + " --> ");
        }
        return new String(s + "null"); /* String builder object cannot be returned, */
                              /* So casting to string object. */
    }
}