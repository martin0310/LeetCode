class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subsets(nums,result);
        return result;
    }
    
    public void subsets(int [] nums,List<List<Integer>> result){
        Integer [] subset = new Integer[nums.length];
        helper(nums,subset,0,result);
    } 
    
    public void helper(int [] nums,Integer [] subset,int index,List<List<Integer>> result){
        if(index == nums.length){
            List <Integer> temp = new ArrayList<>();
            for(Integer current : subset){
               if(current != null)
                   temp.add(current);
            }
            result.add(temp);
        }
        else{
            subset[index]=null;
            helper(nums,subset,index+1,result);
            subset[index]=nums[index];
            helper(nums,subset,index+1,result);
        }
    }
    
}
