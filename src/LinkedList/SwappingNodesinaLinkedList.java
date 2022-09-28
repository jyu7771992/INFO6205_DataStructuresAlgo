package LinkedList;

class Solution{
    public ListNode swapNodes(ListNode head, int k) {
        int list_len = 0;
        ListNode prevNode = null;
        ListNode nextNode = null;
        ListNode curNode = head;

        // set the front node & find the length of list
        while(curNode != null){
            list_len++;
            if(list_len == k){
                prevNode = curNode;
            }
            curNode = curNode.next;
        }
        //set the end node at (len - k)th node
        nextNode = head;
        for(int i = 1; i <= list_len - k; i++){
            nextNode = nextNode.next;
        }
        //change prevNode & nextNode & curNode
        int temp = prevNode.val;
        prevNode.val = nextNode.val;
        nextNode.val = temp;

        return head;
    }
}
