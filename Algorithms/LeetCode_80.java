class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        int freq = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(freq > 2) continue;
            if(freq < 2 && nums[i] == nums[i+1]){
                nums[index++] = nums[i+1];
                freq++;
            }
            if(nums[i] != nums[i+1]){
                nums[index++] = nums[i+1];
                freq = 1;
            }
            //else if(nums[i] == nums[i+1])
            //    freq++;
        }
        return index;
    }
}
