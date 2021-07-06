/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        if(head.next == head) return head;
        if(head.next == null) return null;
        
        /*ListNode slow=head;
        ListNode fast=head.next;
        ListNode temp=null;
        ListNode point=null;
        
        while(slow != fast){
            point=slow;
            if(fast == null || fast.next == null)
                return null;
            slow=slow.next;
            fast=fast.next.next;
            
            if(fast.next.next == fast && slow == fast)
                return slow.next;
            else if(slow == fast && fast.next.next != fast)
                return fast;
        }
        return temp;*/
        
        ListNode first=head;
        ListNode second=head;
        Boolean is_cycle=false;
        int count=0;
        while(first != null){
            if(count == 10001) break;
            count++;
            
            first.val=0;
            first=first.next;
            if(first == null) return null;
        }
        while( second.next.val != 1){
            second.val=1;
            second=second.next;
        }
        
        return second.next;
        
    }
}
