class Solution {
    public int removeDuplicates(int[] nums) {
        //int count=1;
        if(nums.length>=2){
            int pointer=0;      
            int j=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                pointer=1;
            }
        }   
        if(nums[nums.length-2]!=nums[nums.length-1]){
            pointer=1;
        }
        if(pointer==0){
            j=1;
        }    
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                //count++;
                nums[j]=nums[i];
                j++;
            }
           
        }
         if(nums[nums.length-2]!=nums[nums.length-1]){
                nums[j]=nums[nums.length-1];
                j++;
            }else if(nums[nums.length-2]==nums[nums.length-1] && pointer==1){
             nums[j]=nums[nums.length-1]; 
             j++;           
         }
          
        return j;
        }
        else if(nums.length==1){
            return nums.length;
        }
        else{
            return nums.length;
        }
    }
}
