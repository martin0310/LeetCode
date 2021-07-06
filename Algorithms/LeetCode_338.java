class Solution {
    public int[] countBits(int num) {
        int [] dp = new int[num + 1];
        dp[0] = 0;
        if(num == 0)
            return dp;
        dp[1] = 1;
        if(num == 1)
            return dp;
        
        for(int i = 2; i < dp.length; i++){
            dp[i] = i % 2 == 0 ? dp[i/2] : dp[i - 1] + 1;
        }
        return dp;
    }
}
