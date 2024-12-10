class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length; // size of the grid (n x n)

        // Loop over each row
        for (int i = 0; i < n; i++) {
            // Compare the i-th row with each column
            for (int j = 0; j < n; j++) {
                int flag = 1; // Assume they are equal unless proven otherwise
                // Compare the i-th row with the j-th column
                for (int k = 0; k < n; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        flag = 0;  // Set flag to 0 if there's a mismatch
                        break;  // Exit the innermost loop since we found a mismatch
                    }
                }
                if (flag == 1) {
                    count++; // If the row and column are equal, increment the count
                }
            }
        }
        return count;
    }
}
