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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head.next == null) return head;
        Stack<ListNode> stack = new Stack<>();
        int count = 0;
        ListNode count_node = head;
        while(count_node != null){
            count++;
            count_node = count_node.next;
        }
        ListNode temp = head;
        ListNode post = head;
        for(int i = 1; i <= n + 1; i++){
            if(i == n + 1)
                post = temp;
            if(i >= m && i <= n ){
                stack.push(temp);
            }
            if(temp.next != null)
            temp = temp.next;
        }
        //return head;
        if(m > 1 && count != n){
            ListNode current = head;
            for(int i = 1 ; i <= n - 1; i++){
                
                if(i >= m - 1 && i <= n - 1 ){
                    current.next = stack.pop();
                }
                current = current.next;
            }
            current.next = post;
        }
        else if(m == 1 && count != n){
            ListNode current = stack.pop();
            head = current;
            while(!stack.isEmpty()){
                current.next = stack.pop();
                current = current.next;
            }
            current.next = post;
         }
        else if(m != 1 && count == n){
            ListNode current = head;
            for(int i = 1; i <= n; i++){
                if(i >= m - 1 && i <= n - 1){
                    current.next = stack.pop();
                }
                if(i == n){
                    current.next = null;
                    break;
                }
                current = current.next;    
            }
        }
        else if(m == 1 && count == n){
            ListNode current = new ListNode(0);
            current = stack.pop();
            head = current;
            for(int i = 1 ; i < count; i++){
                current.next = stack.pop();
                current = current.next;
            }
            current.next = null;
           
        }
        
        return head;
        
    }
}
