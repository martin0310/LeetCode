class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j-1] == 0){
                    temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
         /*for(int i=0;i<nums.length;i++){
            int temp=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j-1] == 0){
                    temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }*/
        if(nums[0] == 0){
            
            for(int i=0;i<nums.length-1;i++){
                int temp=0;
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
    }
}
