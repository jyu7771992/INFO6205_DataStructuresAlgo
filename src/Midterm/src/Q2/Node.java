package Q2;

public class Node <T> {
    public T data;
    public Q3.Node<Integer> left;
    public Q3.Node<Integer> right;
    public Q3.Node<Integer> parent;
    public Node(T data){
        this.data = data;
    }
}
