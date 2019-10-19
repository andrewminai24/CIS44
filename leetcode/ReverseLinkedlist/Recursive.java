/*
CIS44 Lab-4 
Question 1.
This is the recursive solution for reversing 
a linkedlist
Big Oh
Time:O(n)
Space: O(n)
*/

import java.util.LinkedList;

public class ListNode {
    *     int val;
    *     ListNode next;
    *     ListNode(int x) { 
            val = x; 
    }
}

public class Recursive{
    public static void main(String[] args){
        
    }
    
    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null){ //Base case
            return head;
        }
        ListNode reverseListHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseListHead;
    }


}