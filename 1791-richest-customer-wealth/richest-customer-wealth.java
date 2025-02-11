class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wArr = new int[accounts.length];
        

        for(int i = 0 ; i < accounts.length ; i++)
        {  int sum = 0 ;
            for(int j = 0 ; j <accounts[i].length ; j++ )
            {
              sum += accounts[i][j];
            }
            wArr[i] = sum ;
        }
        int maxWealth = wArr[0] ;
        for(int i = 0 ; i < wArr.length ; i++)
        {
            if(wArr[i] > maxWealth )
            {
                maxWealth = wArr[i];
            }
        }
        return maxWealth ;
    }
}