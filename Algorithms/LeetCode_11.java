class Solution {
    public int maxArea(int[] height) {
        int [] max_for_each = new int [height.length];
        for(int i = 0; i < max_for_each.length; i++){
            max_for_each[i] = each_max(i,height);
        }
        int max = 0;
        for(int i = 0; i < max_for_each.length; i++){
            if(max_for_each[i] >= max)
                max = max_for_each[i];
        }
        
        return max;
    }
    
    public int each_max(int index,int [] height){
        int max = 0;
        for(int i = 0 ; i < index ;i++){
            //int temp_index = i ; 
            
            //   continue;
            int length = index - i;
            int tall = 0;
            if(height[i] < height[index])
                tall = height[i];
            else
                tall = height[index];
            int area = length * tall;
            if(area >= max)
                max = area;
        }
        
        return max;
    } 
}
