package ctci.datastructures.linkedlist;

public class LinkedList<T> {
    private LinkedListNode<T> head;
    private LinkedListNode<T> end;

    public LinkedList() {
    }

    public LinkedListNode<T> getHead() {
        return this.head;
    }

    public void append(T data) {
        var node = new LinkedListNode<>(data);
        if (this.head == null) {
            this.head = node;
        } else {
            this.end.setNext(node);
        }

        this.end = node;
    }
    public boolean contains(T data) {
        var tmp = this.head;
        while (tmp != null) {
         if (tmp.getData().equals(data)) {
             return true;
         }
         tmp = tmp.getNext();
        }
        return false;
    }
}
