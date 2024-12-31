package FinalYear;

class linkedList {
    int size = 0;
    Node head=null; Node tail=null;
    public void insertAtStart(int val) {
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    public void insertAtEnd(int val) {
        Node temp = new Node(val);
        if(head==null) head = temp;
        else  tail.next = temp;
        tail = temp;
        size++;
    }
    public void insertAt(int val, int idx) {
        if(head==null){
            insertAtEnd(val);
            return;
        }
        Node a = head;
        Node temp = new Node(val);
        for(int i=0; i<idx-1; i++) {
            a = a.next;
        }
        temp.next = a.next;
        a.next = temp;
        size++;
    }
    public void deleteAtStart() {
        if(head==null) return;
        head = head.next;
        size--;
    }
    public void deleteAtEnd() {
        if(head==null) return;
        Node temp = head;
        while(temp.next.next!=null) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;
    }
    public void deleteAt(int idx) {
        if(head==null) return;
        Node temp = head;
        for(int i=0; i<idx-1; i++) temp = temp.next;
        temp.next = temp.next.next;
        size--;
    }
    public void display() {
        Node temp = head; // Shallow Copy
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Implementation {
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(10);
        ll.display();
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.display();
        ll.insertAtStart(5);
        ll.insertAt(15,2);
        ll.display();
        ll.deleteAtStart();
        ll.deleteAtEnd();
        ll.display();
        ll.deleteAt(1);
        ll.display();
    }
}
