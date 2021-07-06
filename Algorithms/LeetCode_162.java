class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length <= 1) return 0;
        
        if(nums[0] > nums[1] ) return 0;
        
        int index=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1])
                index=i;
        }
        if(nums.length >= 3){
            if(index == 0 && nums[nums.length-2] > nums[nums.length-3] && nums[nums.length-2] > nums[nums.length-1])
            index=nums.length-2;
        }
        if(nums[nums.length-1] > nums[nums.length-2])
            index=nums.length-1;
         return index;
    }
       
    
 }
