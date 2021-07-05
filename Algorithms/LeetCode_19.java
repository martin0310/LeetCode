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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode temp = head;
        ListNode current = head;
        int count = 0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        if(count == 1 && n == 1) return null;
        for(int i=1;i<=count-n+1;i++){
            if(i == count-n+1 && i == 1) return head.next;
            if(i == count-n){
                current.next=current.next.next;
                break;
            }
                
            current=current.next;
        }
        
        return head;
    }
}
