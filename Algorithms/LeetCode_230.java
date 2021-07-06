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
    
    public List<Integer> list = new ArrayList<>();
    
    public int kthSmallest(TreeNode root, int k) {
        backtrack(root);    
        Collections.sort(list);
        
        return list.get(k - 1);
    }
    
    public void backtrack(TreeNode root){
        
        if(root == null) return ;
        else 
            list.add(root.val);
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        backtrack(left);
        backtrack(right);
        
    }
}
