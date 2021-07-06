class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        Arrays.sort(nums);
        int length = 1;
        int max_length = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1] && i != nums.length - 1) continue;
            if(nums[i] == nums[i - 1] + 1){
                length++;
            }
            
            if(nums[i] != nums[i - 1] + 1){
                if(length >= max_length){
                    max_length = length;
                    length = 1;
                }
                else
                   length = 1; 
            }
            if(i == nums.length - 1){
                if(length >= max_length){
                    max_length = length;
                    length = 1;
                }
            }
        }
        
        return max_length;
    }
}
