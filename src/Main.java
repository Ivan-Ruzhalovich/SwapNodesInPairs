public class Main {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2,a);
        ListNode c = new ListNode(3,b);
        ListNode d = new ListNode(4,c);
        ListNode e = new ListNode(5,d);
        ListNode f = new ListNode(6,e);
        System.out.println(SwapNodesInPairs.swapPairs(d));
    }
}