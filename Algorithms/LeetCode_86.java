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
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode smaller_node = new ListNode(0);
        ListNode smaller_start = smaller_node;
        ListNode greater_node = new ListNode(0);
        ListNode greater_start = greater_node; 
        //ListNode temp_smaller;
        //ListNode temp_greater;
        
        while(head != null){
            
            if(head.val < x){
                smaller_node.next = new ListNode(head.val);
                smaller_node = smaller_node.next; 
                
            }
            else if(head.val >= x){
                greater_node.next = new ListNode(head.val);
                greater_node = greater_node.next; 
            }
            
            head = head.next;
        }
        smaller_node.next = greater_start.next;
        
        return smaller_start.next;
    }
}
