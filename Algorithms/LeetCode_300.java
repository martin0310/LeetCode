class Solution {
    public int lengthOfLIS(int[] nums) {
        int [] dp = new int [nums.length];
        Arrays.fill(dp, 1);
        for(int i = nums.length - 1;i >= 0; i--){
            int max = 0;
            //int max_index = -1;
            for(int j = i; j < nums.length; j++){
                if(nums[j] > nums[i] && dp[j] > max){
                    max = dp[j];
                }
            }
            dp[i] += max;
        }
        
        int max = dp[0];
        for(int i = 0; i < dp.length; i++){
            if(dp[i] >= max)
                max = dp[i];
        }
        
        return max; 
    }
}
