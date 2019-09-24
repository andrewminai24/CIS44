/*
We use linkedlists to store objects in
sequence autoimatically 
address of the next node in the list
these nodes are linked together
first = head and last = tail
LookUp O(n)
By Index O(n)


Insert 
At the End O(1)
At the Beginning O(1)
At the middle O(n)
Create a new node at the tail
have to have a reference to the head
*/

public class LinkedList{
    public static void main(String[] args){
        LinkedList<String> object = new Linked<String>();

        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add("F");
        object.add("G");
        System.out.println("LinkedList:" + object);

        //Removing elements from the linkedlist
        object.remove("B");
        object.remove(3);
        object.removeFirst();
        object.removeLast();
        System.out.println("LinkedList after deletion " + object);

        //Finding elements in the linkedlist 
        boolean status = object.contains("E");

        if(status)
            System.out.println("List contains the element 'E'");
        else
            System.out.println("List contains the element 'E'");
        //Number of elements in the linked list
        int size = object.size();
        System.out.println("Size of linkedList = " + size);

        //get and set elements from linkedList
        Object element = object.get(2);
        System.out.println("Element returned by get(): " + element);
        object.set(2,"Y");
        System.out.println("LinkedList after change" + object);

    }
}