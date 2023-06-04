package DoublyLinkedList;
/**
 *  Lidor pahima
 *  ID : 206735971
 * Represents a Doubly Linked List data structure.
 * @param <T> the type of elements stored in the linked list
 */
public class DoublyLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int size;

    /**
     * Checks if the linked list is empty.
     *
     * @return true if the linked list is empty, false otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Returns the size of the linked list.
     *
     * @return the size of the linked list
     */
    public int size() {
        return size;
    }

    /**
     * Adds an element at the beginning of the linked list.
     *
     * @param data the element to add
     */
    public void addFirst(T data) {
        if (isEmpty()) {
            head = tail = new Node<T>(data, null, null);
        } else {
            head.prev = new Node<T>(data, null, head);
            head = head.prev;
        }
        size++;
    }

    /**
     * Adds an element at the end of the linked list.
     *
     * @param data the element to add
     */
    public void addLast(T data) {
        if (isEmpty()) {
            head = tail = new Node<>(data, null, null);
        } else {
            tail.next = new Node<T>(data, tail, null);
            tail = tail.next;
        }
        size++;
    }

    /**
     * Removes the first occurrence of the specified element from the linked list.
     *
     * @param data the element to remove
     * @return the removed element, or null if the element is not found
     */
    public T remove(T data) {
        if (head == null) {
            return null;
        }
        if (head.data.equals(data)) {
            T removeData = head.data;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
            return removeData;
        } else {
            Node<T> current = head;
            while (current != null) {
                if (current.data.equals(data)) {
                    T removedData = current.data;
                    Node<T> prev = current.prev;
                    Node<T> next = current.next;
                    size--;
                    if (next != null) {
                        next.prev = prev;
                    }
                    if (prev != null) {
                        prev.next = next;
                    }
                    return removedData;
                }
                current = current.next;
            }
            return null;
        }
    }

    /**
     * Clears the linked list, removing all elements.
     */
    public void clear() {
        Node<T> current = head;
        while (current != null) {
            current.data = null;
            Node<T> nextNode = current.next;
            current.next = null;
            current.prev = null;
            current = nextNode;
        }
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Checks if the linked list contains the specified element.
     *
     * @param data the element to check
     * @return true if the linked list contains the element, false otherwise
     */
    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Prints the elements of the linked list in forward order.
     */
    public void printForwards() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("\n");
    }

    /**
     * Prints the elements of the linked list in backward order.
     */
    public void printBackward() {
        Node<T> current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println("\n");
    }

    /**
     * Represents a node in the doubly linked list.
     *
     * @param <T> the type of data stored in the node
     */
    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
