class Solution {
    public int jump(int[] nums) {
        int ans = 0;
        int max = 0;
        int current_max = 0;
        for(int i = 0; i < nums.length - 1; i++){
            max = Math.max(max,nums[i] + i);
            if(current_max == i){
                ans++;
                current_max = max;
            }
        }
        
        return ans;
    }
}
