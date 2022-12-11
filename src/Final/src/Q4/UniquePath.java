package Q4;

class Solution {
    //dynamic programming
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //define the range of grid
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        // If the starting cell has an obstacle, then simply return as there would be
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        // start from the first position in the grid
        obstacleGrid[0][0] = 1;

        // stored the values for the first column
        for (int i = 1; i < row; i++) {
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
        }
        // stored the values for the first row
        for (int i = 1; i < col; i++) {
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1 : 0;
        }
        // Starting from cell(1,1) fill up the value
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                } else {
                    obstacleGrid[i][j] = 0;
                }
            }
        }

        // Return value stored in each position of the grid
        return obstacleGrid[row - 1][col - 1];
    }
}
//Time Complexity: O(m * n)
//Space Complexity: O(1)
//Constraints
//m == obstacleGrid.length
//n == obstacleGrid[i].length
//1 <= m, n <= 100
//obstacleGrid[i][j] is 0 or 1.
