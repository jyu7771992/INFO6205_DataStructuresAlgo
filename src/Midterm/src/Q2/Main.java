package Q2;

import Q3.Node;

public class Main {

    public static void findParent(Node<Integer> node, int val, Integer parent) {
        System.out.println("Hello world!");
        if (node == null)
            return;

        if (node.data == val) {
            // Print its parent
            System.out.print(parent);
        } else
        {
            // Recursive calls for the children of the current node
            // Current node is now the new parent
            findParent(node.left, val, (Integer) node.data);
            findParent(node.right, val, (Integer) node.data);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


