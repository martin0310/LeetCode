class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;
        
        while(top <= bottom){
            int mid = top + (bottom - top) / 2;
            if(matrix[mid][0] == target) 
                return true;
            else if(matrix[mid][0] > target)
                bottom = mid - 1;
            else if(matrix[mid][0] < target)
                top = mid + 1;
            
        }
        if(top > 0)
        top = top - 1;
        int left = 0;
        int right = matrix[0].length - 1;
            
        while(left <= right){
            int middle = left + (right - left) / 2;
            if(matrix[top][middle] == target)
                return true;
            else if(matrix[top][middle] > target)
                right = middle - 1;
            else if(matrix[top][middle] < target)
                left = middle + 1;
        }
        return false;
    }
}
