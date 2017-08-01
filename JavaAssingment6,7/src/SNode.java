/**
 *
 * Java Assignment Day 7.
 * Created by zemosozemoso on 20/7/17.
 */
class SNode<T> { /* Creates a new Node. */
    private T data;
    SNode<T> next;

    SNode(T data, SNode<T> next) {
        this.data = data;
        this.next = next;
    }

    SNode(T data) {
        this(data, null);
    }

    public String toString() {
        if(data == null) return "null";
        return data.toString();
    }
}