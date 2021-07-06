class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        if(nums.length>=2){
                for(int i=1;i<nums.length;i++){
                if(i==nums.length-1)
                    break;
                if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                    result=nums[i];
                    break;
                }
            }
            if(nums[0]!=nums[1] )
                result=nums[0];
            if(nums[nums.length-1]!=nums[nums.length-2])
                result=nums[nums.length-1];
        }
        else 
            result=nums[0];
        
        return result;
    }
}
