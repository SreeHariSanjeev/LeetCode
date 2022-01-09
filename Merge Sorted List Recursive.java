class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;
        if(list1 != null && list2 != null)
        {
            if(list1.val<list2.val)
            {
                 result = list1;
                result.next = mergeTwoLists(list1.next,list2);
            }
            else
            {
                 result = list2;
                result.next = mergeTwoLists(list1,list2.next);
            }

        }
        else if(list1 != null)
        {
            result = list1;
            result.next = mergeTwoLists(list1.next,list2);
        }
        else if(list2 != null)
        {
            result = list2;
            result.next = mergeTwoLists(list1, list2.next);
        }
        return result;
    }
}
