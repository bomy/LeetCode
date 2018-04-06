/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * Time :O(n)
 * Space : O(1)
 *
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        ListNode fast = temp;
        ListNode slow = temp;
        temp.next = head;
        for(int i = 0; i<=n; i++)
        {
            fast = fast.next;
        }
        
        while(fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return temp.next;
    }
}