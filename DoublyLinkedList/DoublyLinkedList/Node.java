package DoublyLinkedList;
/**
 * Lidor pahima
 * ID : 206735971
 * The Node class represents a node in a doubly linked list.
 *
 * @param <T> the type of data stored in the node
 */
public class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    /**
     * Constructs a node with the specified data, previous node, and next node.
     *
     * @param data the data to be stored in the node
     * @param prev the previous node
     * @param next the next node
     */
    public Node(T data, Node<T> prev, Node<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    /**
     * Retrieves the data stored in the node.
     *
     * @return the data stored in the node
     */
    public T getData() {
        return data;
    }

    /**
     * Retrieves the previous node.
     *
     * @return the previous node
     */
    public Node<T> getPrev() {
        return prev;
    }

    /**
     * Retrieves the next node.
     *
     * @return the next node
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Sets the data stored in the node.
     *
     * @param data the data to be stored in the node
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Sets the previous node.
     *
     * @param prev the previous node to be set
     */
    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    /**
     * Sets the next node.
     *
     * @param next the next node to be set
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }
}