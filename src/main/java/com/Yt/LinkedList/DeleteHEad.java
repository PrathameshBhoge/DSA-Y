package main.java.com.Yt.LinkedList;

public class DeleteHEad {
    public static void main(String[] args) {
        Node a =new Node(30);
        Node b = new Node(40);
        Node c = new Node(50);
        Node e = new Node(60);

        Node head = a;
        a.next=b;
        b.next=c;
        c.next=e;
        e.next=null;

        head =removeHead(head);
        Display(head);
    }

    static Node removeHead(Node head){
        if(head ==null){
            return null;
        }
        head = head.next;

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
