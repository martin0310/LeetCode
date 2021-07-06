class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] dupli = Arrays.copyOf(nums,nums.length);
        
        Arrays.sort(nums);
        int [] ans = new int [2];
        int i = 0;
        int j = nums.length - 1;
        int first = 0;
        int second = 0;
        
        while(i < j){
            if(nums[i] + nums[j] == target){
                first = nums[i];
                second = nums[j];
                break;
            }
            else if(nums[i] + nums[j] < target){
                i = i + 1;
            }
            else if(nums[i] + nums[j] > target){
                j = j - 1;
            }
        }
        for(int k = 0; k < dupli.length; k++){
            if(dupli[k] == first){
                ans[0] = k;
                break;
            }
                
        }
        
        for(int k = 0; k < dupli.length; k++){
            if(dupli[k] == second && k != ans[0])
                ans[1] = k;
        }
        
        return ans;
    }
}
