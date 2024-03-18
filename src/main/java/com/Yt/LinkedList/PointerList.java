package main.java.com.Yt.LinkedList;

//It allocates the same memory Address for Both.
public class PointerList {
    public static void main(String[] args) {
        Node node = new Node(30);
        Node y = node;
        System.out.println("Data of Y "+y);
        System.out.println("Data of Node "+node);
    }
}

