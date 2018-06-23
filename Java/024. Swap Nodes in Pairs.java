/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode SwapPairs(ListNode head) {
         if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l1 = dummy;
        ListNode l2 = head;
        while(l2 != null && l2.next != null)
        {
            ListNode nextStart = l2.next.next;
            l1.next = l2.next;
            l2.next.next =l2;
            l2.next = nextStart;
            l1 = l2;
            l2 = l2.next;
            
        }
        return dummy.next;
    }
}