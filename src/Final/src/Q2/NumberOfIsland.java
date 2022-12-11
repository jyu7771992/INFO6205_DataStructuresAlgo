package Q2;

import java.lang.reflect.Array;

public class NumberOfIsland {
    // create dfs route for tracking 1 or 0

    void dfs(char[][] grid, int r, int c) {
        //define the range of nr & nc
        int nr = grid.length;
        int nc = grid[0].length;
        // base case the range of grid
        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }
        //if visited, mark as 0
        grid[r][c] = '0';
        // go four direction: left, right, top, down
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public int numIslands(char[][] grid) {
        // edge case to check the grid which is null or not
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // define the range of grid
        int row = grid.length;
        int col = grid[0].length;
        int num_islands = 0; // count the islands
        for (int r = 0; r < row; ++r) {
            for (int c = 0; c < col; ++c) {
                if (grid[r][c] == '1') { // if check the position marked as islands
                    ++num_islands;
                    dfs(grid, r, c); // implement the method of tracking each position in the grid
                }
            }
        }

        return num_islands;
    }
}
//Time Complexity: O(M*N)
//Space Complexity: O(M*N)
