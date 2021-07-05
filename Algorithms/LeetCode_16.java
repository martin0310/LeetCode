class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int difference=Math.abs(nums[0]+nums[1]+nums[2]-target);
        int output=nums[0]+nums[1]+nums[2];
        if(nums.length == 3){
            output=nums[0]+nums[1]+nums[2];
            return output;
        }
        
        int point=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                point=1;
                break;
            }
        }
        if(point == 0) return nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            /*if(i==0 || (i > 0 && ))*/
            if(i == 0 || (i>0 && nums[i] != nums[i-1])){
               int low=i+1;
            int high=nums.length-1;
            int sum=target-nums[i];
            while(low < high){
                if(Math.abs(sum - nums[low] - nums[high]) < difference){
                    while(low < high && nums[low] == nums[low+1]) low++;
                    while(low < high && nums[high] == nums[high-1]) high--;
                    difference=Math.abs(target - nums[i] - nums[low] - nums[high]);
                    output=nums[i] + nums[low] + nums[high];
                }else if(Math.abs(sum - nums[low] - nums[high]) >= difference && (sum - nums[low] - nums[high]) <= 0){
                    //low++;
                     high--;
                }else if(Math.abs(sum - nums[low] - nums[high]) >= difference && (sum - nums[low] - nums[high]) >= 0){
                    //high--;
                    low++;
                }
            } 
            }
            
                
        }
        return output;
    }
}
