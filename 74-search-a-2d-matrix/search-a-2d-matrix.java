class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int  l = 0, r = row*col-1;
        int mid = 0;
        while(l<=r){
            mid = l+(r-l)/2;
            int row_no = mid/col;
            int col_no = mid%col;
            //System.out.println(row_no+":"+col_no+"::"+mid);

            if(target == matrix[row_no][col_no]) return true;
            else if(target<matrix[row_no][col_no]) r = mid-1;
            else l = mid+1;
        }

        return false;
        
    }
}