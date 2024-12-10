package ctci.datastructures.linkedlist;

import ctci.util.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void shouldCreateLinkedListWithGivenValues() {
        var arr = Util.randIntegerArray(5);
        var linkedList = new LinkedList<Integer>();

        for (int i: arr) {
            linkedList.append(i);
        }

        var node = linkedList.getHead();

        for (int i : arr) {
            Assertions.assertEquals(i, node.getData());
            node = node.getNext();
        }
    }
}
