class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] a=new int [grid[0].length];
              //          System.out.println(grid.length);

        int k=0,c=0;
        for(int i=0;i<grid[0].length;i++){
           c=0;
            for(int  j=0;j<grid.length;j++){
                c=Math.max( c , String.valueOf( grid[j][i] ).length() );;
              //  System.out.print(grid[i][j]);
               
            }
            System.out.println();
             a[k++]=c;
             
               
        }
        return a;
    }
}