class Solution {
    public int candy(int[] ratings) {
        int [] result = new int [ratings.length];
        Arrays.fill(result,1);
        for(int i = 0; i < result.length - 1; i++){
            if(ratings[i + 1] > ratings[i])
                result[i + 1] = result[i] + 1;
        }//forward
        
        for(int i = result.length - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1] /*&& result[i] <= result[i + 1]*/)
                result[i] = Math.max(result[i],result[i + 1] + 1);
        }//backward
        
        int sum = 0;
        for(int i = 0; i < result.length; i++){
            sum += result[i];
        }
        
        return sum;
    }
}
