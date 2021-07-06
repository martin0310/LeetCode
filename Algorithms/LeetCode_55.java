class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1 && nums[0] == 0) return true;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 0){
                int sub_array_length = 1;
                int index = i;
                if(index == 0) return false;
                while(nums[index] == nums[index - 1] - 1 || nums[index] == nums[index - 1]){
                    sub_array_length++;
                    index--;
                    if(index == 0) return false;
                }
                if(nums[index - 1] < sub_array_length + 1){
                    sub_array_length++;
                    index --;
                    int flag = 0;
                    for(int j = index; j >= 0; j--){
                        if(nums[j] >= sub_array_length){
                            flag = 1;                           
                            break;
                        }
                        sub_array_length++;   
                    }
                    if(flag != 1) return false;
                } 
                
                
            }
        }
        
        return true;
    }
}
