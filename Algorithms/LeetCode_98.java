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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);    
        
        for(int i = 0;i < list.size() - 1;i++){
            int first = list.get(i);
            int second = list.get(i + 1);
            if(first >= second)
                return false;
        }
        
        return true;
    }
    
    public void dfs(TreeNode node,List<Integer> list){
        if(node == null) return ;
        
        dfs(node.left,list);
        list.add(node.val);
        dfs(node.right,list);
    }
}
