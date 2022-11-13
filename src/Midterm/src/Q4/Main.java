package Q4;

public class Main {

    public static void main(String[] args) {
        // input keys
        int[] keys = {2, 4, 6, 8};

        // points to the head node of the linked list
        Node head = null;

        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }

        head = insert(head, new Node(5));
        head = insert(head, new Node(9));
        head = insert(head, new Node(1));

    }

    private static Node insert(Node head, Node node) {
        // special case for the head end
        if (head == null || head.data >= node.data)
        {
            node.next = head;
            head = node;
            return head;
        }

        // locate the node before the point of insertion
        Node current = head;
        while (current.next != null && current.next.data < node.data) {
            current = current.next;
        }

        node.next = current.next;
        current.next = node;

        return head;
    }

    // 1->3->4 k:2
    //linkedlist has already sorted, 2 will be inserted between 1 & 3
    //TC: O(N)
}
