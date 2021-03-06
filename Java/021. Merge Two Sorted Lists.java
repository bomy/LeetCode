/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode res =dummy;
        while(l1 != null && l2 != null) {
            
            if(l1.val < l2.val) {
                res.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                res.next =  new ListNode( l2.val); 
                l2 = l2.next;
            }
            res = res.next;
        }
        
        if(l1 != null)
        {
            res.next =l1;
        }else{
           res.next =l2;  
        } 
        
        return dummy.next;
        
    }
}