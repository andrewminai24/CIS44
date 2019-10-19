/*
Definition for a singly linkedlist
public class ListNode{
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}
*/
class Solution{
    public ListNode reverseList(Node head){
        Node prev = null;

        while(head != null){
            Node next_node = head.next;
            head.next = prev;
            //
            prev = head;

            head = next_node;

        }
        return prev;
    }
}