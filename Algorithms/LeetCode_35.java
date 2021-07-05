class Solution {
    public int searchInsert(int[] nums, int target) {
        int return_value=0;
        int pointer=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return_value=i;
                pointer=1;
                break;
            }
            
        }
        if(pointer!=1){
           for(int i=0;i<nums.length;i++){
               if(target>=nums[i]){
                   return_value=i+1;
               }
           } 
        }
        return return_value;
    }
}
