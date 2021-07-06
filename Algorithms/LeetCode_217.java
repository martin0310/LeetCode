class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*Boolean bool=false;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    bool=true;
                    break;
                }
            }
            if(bool == true)
                break;
        }
        return bool;*/
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}
