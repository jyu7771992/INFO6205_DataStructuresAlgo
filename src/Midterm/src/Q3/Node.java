package Q3;

public class Node <T> {
    public T data;
    public Node<Integer> left;
    public Node right;

    public Node<Integer> parent;
    public Integer val;

    public Node(T data){
        this.data = data;
    }
}
