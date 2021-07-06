class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int [] arr=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=Math.max(nums[i],nums[i]+arr[i-1]);
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}
