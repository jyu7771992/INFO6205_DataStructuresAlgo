package LinkedList;
class Solution{
    //split the input list directly and return a list of pointers to nodes in the original list as appropriate.
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curNode = head;
        int n = 0;
        while(curNode != null){
            curNode = curNode.next;
            n++;
        }
        ListNode[] res = new ListNode[k];
        int width = n / k;
        int remain = n % k;
        curNode = head;
        for(int i = 0; i < k; i++){
            ListNode dummyhead = curNode;
            for(int j = 0; j < width + (i < remain ? 1 : 0) - 1; j++){
                if(curNode != null) curNode = curNode.next;
            }
            if(curNode != null){
                ListNode prevNode = curNode;
                curNode = curNode.next;
                prevNode.next = null;
            }
            res[i] = dummyhead;
        }
        return res;
    }
}

