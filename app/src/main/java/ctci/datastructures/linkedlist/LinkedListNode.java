package ctci.datastructures.linkedlist;

public class LinkedListNode<T>{
    private T data;
    private LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public T getData() {
        return data;
    }
}
