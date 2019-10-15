/*
CIS44 Lab-4 
Question 1.
This is the recursive solution for reversing 
a linkedlist
Big Oh
Time:O(n)
Space: O(n)
*/


class Recursive{
    
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == nul){
            return head;
        }
        ListNode reverseListHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversedListHead;
    }

}