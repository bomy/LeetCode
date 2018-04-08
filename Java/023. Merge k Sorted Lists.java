/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * Time : O(nlogk) Where k is the number of linked lists
 * Space : O(n)
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
        {
            return null;
        }
        
        return Sort(lists, 0, lists.length-1);
    }
           
    public ListNode Sort(ListNode[] lists, int low, int high)
    {
        if(low>=high)
            return lists[low];
        int mid = (high - low)/2 + low;
        ListNode l1 = Sort(lists, low, mid);
        ListNode l2 = Sort(lists, mid+1, high);
        
        return merge(l1, l2);
    }
           
    public ListNode merge(ListNode l1, ListNode l2)
    {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val< l2.val)
        {
            l1.next = merge(l1.next,  l2);
            return l1;
        }else{
            l2.next = merge(l1, l2.next);
            return l2;    
        }
    }
}