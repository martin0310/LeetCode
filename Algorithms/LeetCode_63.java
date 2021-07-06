class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][] cal = new int [obstacleGrid.length][obstacleGrid[0].length];
        if(obstacleGrid[0][0] == 1) return 0;
        if(obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1) return 0;
        cal[0][0] = 1;
        for(int i = 1; i < obstacleGrid[0].length; i++){
            cal[0][i] = (obstacleGrid[0][i] == 1) ? 0 : cal[0][i - 1];
        }
        for(int i = 1; i < obstacleGrid.length; i++){
            cal[i][0] = (obstacleGrid[i][0] == 1) ? 0 : cal[i - 1][0];
        }
        
        for(int i = 1; i < obstacleGrid.length; i++){
            for(int j = 1; j < obstacleGrid[i].length ; j++){
                if(obstacleGrid[i][j] != 1)
                    cal[i][j] = cal[i -1][j] + cal[i][j - 1];
            }
        }
        
        return cal[cal.length - 1][cal[0].length - 1];
    }
    
}
