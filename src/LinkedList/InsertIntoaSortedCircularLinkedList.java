package LinkedList;
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
//two pointers
class Solution {
    public Node insert(Node head, int insertVal) {
        //base case
        if(head == null){
            Node newNode = new Node(insertVal, null);
            newNode.next = newNode;
            return newNode;
        }
        Node prevNode = head;
        Node curNode = head.next;
        boolean Insert = false;

        do{
            if(prevNode.val <= insertVal && insertVal <= curNode.val){
                // case1
                Insert = true;
                //case2
            } else if(prevNode.val > curNode.val){
                if(insertVal >= prevNode.val || insertVal <= curNode.val){
                    Insert = true;
                }
            }
            if(Insert){
                prevNode.next = new Node(insertVal, curNode);
                return head;
            }
            prevNode = curNode;
            curNode = curNode.next;
        } while(prevNode != head);

        //case 3:
        prevNode.next = new Node(insertVal, curNode);
        return head;
    }
}
