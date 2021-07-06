class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        //int index = nums.length - 1;
        /*int count = 1; 
        for(int i = index; i >= 0;i--){
            if(count == k) return nums[i];
            if(nums[i] != nums[i - 1])
                count++;
        }*/
        
        return nums[nums.length - 1 - k + 1];
    }
}
