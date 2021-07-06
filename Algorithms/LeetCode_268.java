class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        if(nums[0] != 0) return 0;
        int temp=nums[0];
        for(int i=0;i<nums.length;i++){
            if(temp != nums[i])
                return temp;
            
            temp++;
        }
        
        return temp;
    }
}
