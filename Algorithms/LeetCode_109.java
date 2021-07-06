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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        
        int left = 0;
        int right = list.size() - 1;
        int middle = (right + left) / 2;
        TreeNode root = new TreeNode(list.get(middle));
        helper_left(left,middle - 1,root,list);
        helper_right(middle + 1,right,root,list);
        
        return root;
    }
    
    public void helper_left(int left,int right,TreeNode node,List<Integer> list){
        if(left > right) return ;
        int middle = (left + right) / 2;
        node.left = new TreeNode(list.get(middle));
        
        helper_left(left,middle - 1,node.left,list);
        helper_right(middle + 1,right,node.left,list);
        
    }
    
    public void helper_right(int left,int right,TreeNode node,List<Integer> list){
        if(left > right) return ;
        int middle = (left + right) / 2;
        node.right = new TreeNode(list.get(middle));
        
        helper_left(left,middle - 1,node.right,list);
        helper_right(middle + 1,right,node.right,list);
    }
    
    
}
