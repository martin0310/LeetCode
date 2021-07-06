class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        Boolean bool=false; 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == target){
                    bool=true;
                    break;
                }
            }
            if(bool == true)
                break;
        }
        return bool;
    }
}
