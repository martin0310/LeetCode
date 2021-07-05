/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null; 
        ListNode first = head;
        ListNode second = head.next;
        
        while(first != null && second != null){
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
            
            if(first.next != null){
                first = first.next.next;
            }
            if(second.next != null){
                second = second.next.next;
            }
            
        }
        
        return head;
    }
}
