package main.java.com.Yt.LinkedList;

public class ConvertArrayToLinkedList {
    public static void main(String[] args) {
       int arr[]={10,20,30,40,50,60,70};
        Node head = Converter(arr);
        Display(head);
    }

    static Node Converter(int arr[]){
        Node head= new Node(arr[0]);
        Node move=head;
        for(int i=1;i< arr.length;i++){
            Node temp = new Node(arr[i]);
            move.next=temp;
            move= move.next;
        }
        return head;
    }
    static void Display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" -> ");
            curr= curr.next;
        }
        System.out.println();
    }
}
