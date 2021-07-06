class Solution {
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return ;
        
        //int row = matrix.length;
        //int column = matrix[0].length;
        boolean first_row = false;
        boolean first_column = false;
        
        for(int i = 0; i < matrix[0].length; i++){
            if(matrix[0][i] == 0)
                first_row = true;
        }
        
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][0] == 0)
                first_column = true;
        }
        
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
                    
            }
        }
        
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[i].length;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
                    
            }
        }
        
        if(first_row){
            for(int i = 0; i < matrix[0].length;i++){
                matrix[0][i] = 0;
            }
        }
        if(first_column){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
