class Solution {
    public void setZeroes(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;
        int col0 = 1;

        for(int i = 0 ; i<N ; i++){
            for(int j = 0; j<M ;j++){
                if(matrix[i][j]==0){ 
                    //mark the first element of row as zero
                    matrix[i][0] = 0;

                    if(j==0) col0 = 0;
                    else matrix[0][j] = 0;
                    
                    }
            }
        }

        for(int i = 1 ; i<N ; i++){
            for(int j = 1; j<M ;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 ||matrix[0][j]==0) 
                    matrix[i][j]=0;
                    
                    }
            }
        }

        if(matrix[0][0]==0){
            for(int i= 0;i<M;i++){
                matrix[0][i] = 0;
            }
        }

        if(col0==0){
            for(int i = 0;i<N;i++){
                matrix[i][0]=0;
            }
        }
        
        
    }

    // public void helper(int[][] matrix, int i, int j){
    //     int N = matrix.length;
    //     int M = matrix[0].length;
    //     //to set a row as zero, iterate over all colums
    //     for(int x = 0 ; x<M;x++ ){
    //         if(matrix[i][x]!=0){
    //             matrix[i][x]= -100;
    //         }
    //     }

    //     for(int y = 0; y<N; y++){
    //         if(matrix[y][j]!=0){
    //         matrix[y][j] = -100;
    //         }
    //     }
    //}
}