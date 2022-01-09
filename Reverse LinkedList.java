class Solution {
    public ListNode reverseList(ListNode head) {
        if(head != null)
        {
            ListNode current = head;
            ListNode previous = null;
            while(current != null)
            {

                ListNode Next = current.next;
                current.next = previous; 
                previous = current;
                current = Next;
            }
            head = previous;
        }
        return head;
    }
}


//Recursive Approach
class Solution {
    public ListNode reverseList(ListNode head) {

        if(head != null)
        {
            return reverseList(head,null);
        }

        return head;
    }
    ListNode reverseList(ListNode current, ListNode previous)
    {
        ListNode result = null;
        if(current != null)
        {
            result = reverseList(current.next, current);
            current.next = previous;
        }
        else
        {
            //When current is null, we have reached end of the list, so we assign previous/last element as result
            //result is returned to main function recursively
            result = previous;
        }
        return result;
    }
}
