package LinkedList;
class SolutionReomove {
    public ListNode RemoveLinkedListElements(ListNode head, int val) {
        //pick the node-predecessor prev of the node to delete
        // set its next pointer to point to the node next to the one to delete

        ListNode dummynode = new ListNode(0);
        dummynode.next = head;

        ListNode preNode = dummynode, curNode = head;
        while(curNode != null){
            if(curNode.val == val) {
                preNode.next = curNode.next;
            }else {
                preNode = curNode;
            }
            curNode = curNode.next;
        }
        return dummynode.next;
    }
}
