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
    public ListNode reverseList(ListNode head) {
        List<Integer> list=new ArrayList<>();
        if(head == null) return head;
        while(head != null){
           list.add(head.val);
            head=head.next;
       }
       //list.add(head.val);
        
       ListNode node=new ListNode(0);
       ListNode temp=node;
       for(int i=list.size()-1;i>=0;i--){
           
           ListNode current=new ListNode(0);
            node.val=list.get(i);
           if(i==0) break;
           node.next=current;
          
          
           node=node.next;
       }
        return temp;
    }
}
