class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2) return nums;
        int [] output = new int [2];
        Arrays.sort(nums);
        int index=0;
        if(nums[0] != nums[1]){
            output[index++]=nums[0];
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1]){
                output[index++]=nums[i];
            }
            if(index == 2)
                break;
        }
        if(nums[nums.length-1] != nums[nums.length-2])
            output[index]=nums[nums.length-1];
        
        return output;
    }
}
