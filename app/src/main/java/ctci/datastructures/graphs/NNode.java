package ctci.datastructures.graphs;

import java.util.List;

public class NNode<T> {
    private T data;
    private List<NNode<T>> children;

    public NNode(T data, List<NNode<T>> children) {
        this.data = data;
        this.children = children;
    }

    public T getData() {
        return this.data;
    }

    public List<NNode<T>> getChildren() {
        return this.children;
    }
}
