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
}
public class LinkedList{
    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = this;

        //when it is not null keep on going
        while(current.next != null){
        //get to the end of the linkedlist
            current = current.next;
        }
        current.next = new Node(data);
    }
    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }
    public void deleteWithValue(int data){
        if(head == null) return;
        if(head.data == data){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
