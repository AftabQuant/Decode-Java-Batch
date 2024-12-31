package DecodeJavaBatch;

public class _1RemoveNthNode {
    public int size(ListNode head) {
        int size = 0;
        while(head!=null){
            size++;
            head = head.next;
        }
        return size;
    }
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        if(head.next == null) return null;
        int len = size(head);
        ListNode temp = head;
        for(int i=0; i<len-n-1; i++) {
            temp = temp.next;
        }
        if(len==2 && n==1) temp.next = null;
        else if(len==n) head = head.next;
        else temp.next = temp.next.next;
        return head;
    }
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode slow = head; ListNode fast = head;
        for(int i=0; i<n; i++) {
            fast = fast.next;
        }
        if(fast==null) head = head.next;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void main(String[] args) {

    }
}
