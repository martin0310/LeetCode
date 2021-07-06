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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node=new ListNode(0);
        ListNode l3=node;
        if(head==null) return null;       
        while(head.next!=null){   
            if(head.val!=head.next.val){
               l3.next=head;
               l3=l3.next;
               head=head.next; 
               
            }else{
                head=head.next;
            }
           
          }
          l3.next=head; 
          //l3=head;
          /*while(head.next!=null){
                if(head.val!=head.next.val){
                    l3.val=head.val;
                    l3=l3.next;
                    head=head.next;
                }else{
                    head=head.next;
                }
                               
          }
           l3.val=head.val;   */    
        return node.next;
        }
       
    }
