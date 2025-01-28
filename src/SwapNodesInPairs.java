public class SwapNodesInPairs {
    //Given a linked list, swap every two adjacent nodes and return its head.
    // You must solve the problem without modifying the values in the list's
    // nodes (i.e., only nodes themselves may be changed.)
//    Example 1:
//
//    Input: head = [1,2,3,4]
//
//    Output: [2,1,4,3]

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ukaz = head;
        ListNode newHead = new ListNode(1,head.next);
        ListNode current = head;
        ListNode currentNext;
        ListNode currentPrev;
        while(current.next!=null){
            currentPrev=current;
            current = ukaz;
            if (current.next!=null){
                currentNext = current.next;
                if (currentNext.next==null){
                    currentNext.next = current;
                    currentPrev.next = currentNext;
                    current.next = null;
                }
                else{
                    ukaz = currentNext.next;
                    current.next = ukaz;
                    currentNext.next = current;
                    currentPrev.next = currentNext;
                }

            }
            else {
                currentPrev.next = current;
            }
        }
        return newHead.next;
    }
}