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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        helper(root,targetSum,0,result,new ArrayList<>());
        return result;
    }
    
    public void helper(TreeNode node,int targetSum,int currentSum,List<List<Integer>> result,List<Integer> temp){
        if(node == null) return ;
        currentSum += node.val;
        temp.add(node.val);
        if(currentSum == targetSum && node.left == null && node.right == null){
            result.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
            return ;
        }
        /*else if(currentSum != targetSum && node.left == null && node.right == null){
            temp.remove(temp.size() - 1);
            return ;
        }*/
        helper(node.left,targetSum,currentSum,result,temp);
        helper(node.right,targetSum,currentSum,result,temp);
        
        temp.remove(temp.size() - 1);
        //temp.remove(temp.size() - 1);
    }
}
