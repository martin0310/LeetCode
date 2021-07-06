class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(0,list,new ArrayList<>(),nums);
        
        return list;
    }
    
    public void helper(int index,List<List<Integer>> list,List<Integer> temp,int[] nums){
        list.add(new ArrayList<>(temp));
        for(int i = index; i < nums.length; i++){
            if(i > index && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            helper(i + 1,list,temp,nums);
            temp.remove(temp.size() - 1);
        }
    }
}
