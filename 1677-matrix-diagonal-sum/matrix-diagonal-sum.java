class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;

        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    s+=mat[i][j];
                    System.out.println(mat[i][j]);
                }}
                if (i != n - i - 1) {
                s += mat[i][n - i - 1];
            }
            
        }
        return s;
    }
}