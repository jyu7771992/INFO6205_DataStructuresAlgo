package Q3;

import java.util.ArrayList;

public class Main {
    private ArrayList<Integer> results;

    public ArrayList<Integer> searchRange(Node node, int n1, int n2) {
        results = new ArrayList<Integer>();
        helper(node, n1, n2);
        return results;
    }

    private void helper(Node root, int n1, int n2) {
        if (root == null) return;

        if (root.val > n1) {
            helper(root.left, n1, n2);
        }

        if (root.val >= n1 && root.val <= n2) {
            results.add(root.val);
        }

        if (root.val < n2) {
            helper(root.right, n1, n2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // Given range between 5 and 8 it will print 6, 7, 8
    private static Node<Integer> getBST(){
        Node<Integer> root = new Node<>(8);
        root.parent = root;

        root.left = new Node<>(3);
        root.right = new Node<>(10);
        root.left.parent = root;
        root.right.parent = root;


        root.left.left = new Node<>(1);
        root.left.right = new Node<>(6);
        root.left.left.parent = root.left;
        root.left.right.parent = root.left;

        root.right.right = new Node<>(14);
        root.right.right.parent = root.right;

        root.left.right.left = new Node<>(4);
        root.left.right.right = new Node<>(17);
        root.left.right.left.parent = root.left.right;
        root.left.right.right.parent = root.left.right;


        root.right.right.left = new Node<>(13);
        root.right.right.left.parent = root.right.right;

        return root;
    }

}
//TimeComplexity: O(N) length of Tree
