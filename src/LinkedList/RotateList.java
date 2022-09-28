package LinkedList;

class Solution {
    public ListNode rotateList(ListNode head, int k){
        //base case

        if(head == null) return null;
        if(head.next == null) return head;

        // the goal is to make the LinkList to be a cycleLinkedList
        ListNode original_tail = head;
        int n;
        for(n = 1; original_tail != null; n++){
            original_tail = original_tail.next;
        }
        original_tail.next = head;

        //new tail: n - k % n - 1 th, new head = n - k % n
        ListNode new_tail = head;
        for(int i = 0; i < n - k % n - 1; i++){
            new_tail = new_tail.next
        }
        ListNode new_head = new_tail.next;

        //make the cycle LinkedList to the line one
        new_tail.next = null;
        return head;
    }
}
