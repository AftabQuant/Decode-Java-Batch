package DecodeJavaBatch;

public class _2SwappingNode {
    public ListNode Node(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1; i<=k; i++) fast = fast.next;
        while(fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode last = Node(head, k);
        ListNode fast = head;
        for(int i=1; i<k; i++) fast = fast.next;
        int temp = fast.val;
        fast.val = last.val;
        last.val = temp;
        return head;
    }
    public static void main(String[] args) {

    }
}
