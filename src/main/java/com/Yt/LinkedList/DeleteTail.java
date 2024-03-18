package main.java.com.Yt.LinkedList;

public class DeleteTail {
    public static void main(String[] args) {
        Node a = new Node(30);
        Node b = new Node(40);
        Node c = new Node(50);
        Node e = new Node(60);

        Node head = a;
        a.next = b;
        b.next = c;
        c.next = e;
        e.next = null;
        head = DeleteTail(head);
        Display(head);
    }

    static Node DeleteTail(Node head){
        if(head==null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp= temp.next;
        }
        temp.next=null;
        return head;
    }
    static void Display(Node head){

        while(head != null){
            System.out.print(head.data+" -> ");
            head= head.next;
        }
        System.out.println();
    }
}
