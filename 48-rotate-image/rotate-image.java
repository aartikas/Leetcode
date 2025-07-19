class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;

        int top = 0;
        int bottom = row-1;

        while(top<bottom){
            for( int i = 0 ; i< row; i++){
                int temp = matrix[top][i];
                matrix[top][i] = matrix[bottom][i];
                matrix[bottom][i]  = temp;
            }
            top++;
            bottom--;
        }

        for(int r = 0; r<row; r++){
            for(int c = r+1; c<row; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
        
    }
}