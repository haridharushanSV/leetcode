class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int sum=0;
        int range=0;
         int arr[]=new int[2];
         int row=grid.length;
         int col=grid[0].length;
         for(int i=0;i<row;i++)
         {
            for(int j=0;j<col;j++)
            {
                range++;
                if(set.contains(grid[i][j])) arr[0]=grid[i][j];
                else
                { 
                set.add(grid[i][j]);
                sum+=grid[i][j];
                }
            }
         }
         int tot=(range*(range+1))/2;
      arr[1]=tot-sum;
      return arr;
    }
}