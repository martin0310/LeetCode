class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        Arrays.sort(nums);
        int ans=0;
        int output=0;
        for(int i=0;i<nums.length-1;i++){
            ans++;
            if(nums[i] == nums[i+1] ){
                continue;
            }else if(nums[i] != nums[i+1] && ans > nums.length/2){
                output=nums[i];
                return output;
            }
        }
       
        if(nums[nums.length-1] == nums[nums.length-2]){
            output=nums[nums.length-1];
            return output;
        }
        
        return output;
    }
}
