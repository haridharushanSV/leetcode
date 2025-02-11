class Solution {
    public int maximumWealth(int[][] accounts) {
        int s=0;
        int[] a=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            s=0;
            for(int j=0;j<accounts[i].length;j++){
                s+=accounts[i][j];
            }
            a[i]=s;
        }

Arrays.sort(a);
        return a[accounts.length-1];
    }
}