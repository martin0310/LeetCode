class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result=new int[2];
        result[0]=-1;
        result[1]=-1;
        if(nums.length <= 2){
            int index=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] == target){
                    result[index]=i;
                    index++;
                }
            }
            if(result[0] != -1 && result[1] == -1)
            result[1]=result[0];
            
        }
        else if(nums.length >= 3){
            int first_index=first(nums,target);
            int last_index =second(nums,target,first_index+1);
        
            result[0]=first_index;
            result[1]=last_index;
            if(result[0] != -1 && result[1] == -1)
            result[1]=result[0];
        }
        
        
        return result;
    }
    
    public int first(int [] nums,int target){
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        while(left <= right){
            if(nums[mid] == target){
                while(mid > 0 && nums[mid-1] == target  ){
                    mid--;
                }
                return mid;
            }
            else if(target > nums[mid]){
                left=mid+1;      
            }
            else if(target < nums[mid]){
                right=mid-1;
            }
            mid=(left+right)/2;
        }
        
        return -1;
    }
    
    public int second(int [] nums,int target,int left){
        int right=nums.length-1;
        int mid=(left+right)/2;
        while(left <= right){
            if(nums[mid] == target){
                while( mid < nums.length-1 && nums[mid+1] == target ){
                    mid++;
                }
                return mid;
            }
            else if(target > nums[mid]){
                left=mid+1;      
            }
            else if(target < nums[mid]){
                right=mid-1;
            }
            mid=(left+right)/2;
        }
        
        return -1;
    }
}
