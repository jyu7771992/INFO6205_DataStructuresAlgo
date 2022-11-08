package Quiz1;
class ListNode { int val; ListNode next; ListNode(int x) { val = x; } }
class Solution1 {

    private ListNode findMiddleElement(ListNode head) {

        // The pointer used to disconnect the left half from the mid node.
        ListNode prevPointer = null;
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        // Iterate until fastPr doesn't reach the end of the linked list.
        while (fastPointer != null && fastPointer.next != null) {
            prevPointer = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        // Handling the case when slowPtr was equal to head.
        if (prevPointer != null) {
            prevPointer.next = null;
        }

        return slowPointer;
    }

    public TreeNode sortedListToBST(ListNode head) {

        // If the head doesn't exist, then the linked list is empty
        if (head == null) {
            return null;
        }

        // Find the middle element for the list.
        ListNode mid = this.findMiddleElement(head);

        // The mid becomes the root of the BST.
        TreeNode node = new TreeNode(mid.val);

        // Base case when there is just one element in the linked list
        if (head == mid) {
            return node;
        }

        // Recursively form balanced BSTs using the left and right halves of the original list.
        node.left = this.sortedListToBST(head);
        node.right = this.sortedListToBST(mid.next);
        return node;
    }
}
