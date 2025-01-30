class Solution {
    public int climbStairs(int n) {
        if(n<=1){
            return 1;
        }
        int f0=0,f1=1,c=0;
        for(int i=0;i<n;i++){
            c=f0+f1;
            f0=f1;
            f1=c;
        }
        return(c);
    }
}