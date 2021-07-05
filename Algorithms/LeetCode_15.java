class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length <= 2) return result;
        
        Arrays.sort(nums);
        /*int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 0){
                index=i;
                break;
            }
        }*/
        
        for(int i=0;i<nums.length-2;i++){
            if(i == 0 || (i>0 && nums[i] != nums[i-1])){
                int low=i+1;
            int high=nums.length-1;
            int sum=0-nums[i];
            while(low < high){
                if(nums[low] + nums[high] == sum){
                    while(low < high && nums[low] == nums[low+1]) low++;
                    while(low < high && nums[high] == nums[high-1]) high--;
                    List<Integer> current=new ArrayList<>();
                    current.add(nums[low]);
                    current.add(nums[high]);
                    current.add(nums[i]);
                    result.add(current);
                    low++;
                    high--;
                }else if(nums[low] + nums[high] > sum){
                    high--;
                }else
                    low++;
                
            }
            }
        }
        
       /* for(int i=0,j=nums.length-1;i<index && j>=index;){
            if( (nums[i]+nums[j])>0 ){
                for(int k=index;k>i;k--){
                    if( (nums[i]+nums[j]+nums[k]) == 0){
                        List<Integer> current=new ArrayList<>();
                        current.add(nums[i]);
                        current.add(nums[j]);
                        current.add(nums[k]);
                        result.add(current);
                        break;
                    }
                }
            }else if( (nums[i]+nums[j]) <= 0 ){
                for(int k=index;k<j;k++){
                    if( (nums[i]+nums[j]+nums[k]) == 0){
                        List<Integer> current=new ArrayList<>();
                        current.add(nums[i]);
                        current.add(nums[j]);
                        current.add(nums[k]);
                        result.add(current);
                        break;
                    }
                }
            }
            if( (nums[i]+nums[j] ) < 0)
                i++;
            else if( (nums[i]+nums[j] ) > 0)
                j--;
            else if( (nums[i]+nums[j] ) == 0){
                for(int k=i+1,h=j-1;
                        j--;
                        break;
                    }
                    else if(nums[k]<nums[h]){
                        i++;
                        break;
                    }else if(k >= h){
                        i++;
                        j--;
                        break;
                    }
                        
                }
                
            }
                
        }*/
        /*int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0)
                count++;
            if(count == 3)
                break;
        }
        if(count == 3){
             List<Integer> current=new ArrayList<>();
            current.add(0);
            current.add(0);
            current.add(0);
            result.add(current);
        }*/
        List<List<Integer>> new_result=new ArrayList<>();
        for(List element: result){
            if( !new_result.contains(element) )
                new_result.add(element);
        }
         /*List<Integer> current=new ArrayList<>();
        current.add(-1);
        current.add(-1);
        current.add(2);
        result.add(current);*/
        return new_result;
    }
}
