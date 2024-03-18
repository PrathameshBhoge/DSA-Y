package main.java.com.Yt.LinkedList;

public class FindingTheLengthofLL {
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

        System.out.println(count(head));

    }

    static int count(Node head){
        int count=0;
        Node temp = head;
        while(temp != null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}
