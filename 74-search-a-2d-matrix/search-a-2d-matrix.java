class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
                int a = matrix[0].length;

        for(int i=0;i<matrix.length;i++){
                    for(int j=0;j<a;j++){
                    if( target==matrix[i][j])
                    return true;
                    }

        }
        return false;
    }
}