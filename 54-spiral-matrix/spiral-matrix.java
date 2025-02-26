class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a=new ArrayList<Integer>();
        int rowlower=0;
        int rowupper=matrix.length-1;
        int collower=0;
        int colupper=matrix[0].length-1;
while(rowlower<=rowupper&&collower<=colupper){
        for(int i=collower;i<=colupper;i++){
            a.add(matrix[rowlower][i]);
        }
        rowlower++;

        for(int j=rowlower;j<=rowupper;j++){
            a.add(matrix[j][colupper]);

        }
        colupper--;

        if(rowlower>rowupper||collower>colupper){
            break;
        }

        for(int k=colupper;k>=collower;k--){
            a.add(matrix[rowupper][k]);
        }
        rowupper--;

        for(int l=rowupper;l>=rowlower;l--){
            a.add(matrix[l][collower]);
        }
        collower++;
}
return a;
    }
}