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
    public void flatten(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root,list); 
        generate_linkedlist(root,0,list);
    }
    
    public void preorder(TreeNode node,List<Integer> list){
        if(node == null) return ;
        list.add(node.val);
        preorder(node.left,list);
        preorder(node.right,list);
    }
    
    public void generate_linkedlist(TreeNode node,int index,List<Integer> list){
        
        if(index == list.size()) return ;
        
        node.val = list.get(index);
        node.left = null;
        if(index < list.size() - 1)
            node.right = new TreeNode(0);
        generate_linkedlist(node.right,index + 1,list);
        
    }
}
