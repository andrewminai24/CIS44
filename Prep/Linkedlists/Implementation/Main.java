/*
Doubly linked list 
each element links to the previous element
*/

public class Node{
    node next;
    int data;
    public Node(int data){
        this.data = data;
    }

    public void append(int data){
        Node current = this;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);

    }
}