package Q1;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree <T> {
    public Node<T> root;

    public BinaryTree() {

    }

    public void populateNextLeft(){
        if(root == null){
            return;
        }
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        boolean nodePrint = true;
        Node preNode = null;
        while(queue.size() != 0){
            Node<T> node = queue.remove();

            if(node != null){
                if(nodePrint == true){
                    System.out.println(node.data);
                    nodePrint = false;
                }
                if(node.left!= null){
                    queue.add(node.left);
                }
                if(node.right!= null){
                    queue.add(node.right);
                }
                if(preNode.nextLeft != null){
                    preNode = node.left;
                }
                preNode = node;
            }
            else{
                // new level
                if(queue.size() == 0){
                    break;
                }
                queue.add(null);
                nodePrint = true;
            }
        }
    }
}
//Time Complexity :O(n)