/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int sum = 0;
        ListNode resultList = new ListNode(0) ;
        ListNode targetList = resultList;

        while(l1 != null || l2 !=null  )
        {
            int l1value = 0;
            int l2value = 0;

            if(l1 != null)
            {
              l1value = l1.val;
              l1 = l1.next;
            }

            if(l2 != null)
            {
              l2value = l2.val;
              l2 = l2.next;
            }

            sum = l1value + l2value + carry;
            targetList.next = new ListNode(sum % 10);
            carry = sum/10;
            targetList = targetList.next ;

        }

         while(carry >0  )
        {
            targetList.next = new ListNode(carry % 10);
            carry = carry/10;
            targetList = targetList.next ;
        }

        return resultList.next;
    }
}
