class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode current = null;
        while(list1 != null || list2 != null)
        {
            ListNode min = null;
            if(list1 != null && list2 != null)
            {
                if(list1.val <= list2.val)
                {
                    min  = list1;
                    list1 = list1.next;
                }
                else
                {
                    min = list2;
                    list2 = list2.next;
                }
            }
            else if(list1 == null)
            {
                min = list2;
                list2 = list2.next;
            }
            else
            {
                min = list1;
                list1 = list1.next;
            }

            System.out.println(min.val);

            if(head == null)
            {
                head = min;
                current = min;
            }
            else
            {
                current.next = min;
                current = current.next;
            }

        }

        return head;
    }
}

