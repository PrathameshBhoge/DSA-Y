package main.java.com.Yt.LinkedList;

public class SerchingElemntInLL {
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

        System.out.println(Search(head,90));
    }

        static boolean Search(Node head,int val){
            Node temp= head;
            while (temp != null){
                if(temp.data == val){
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }
}
