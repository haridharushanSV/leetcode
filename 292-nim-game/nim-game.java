class Solution {
    public boolean canWinNim(int n) {
        // boolean ist=true;
        // if(n%3==0){
        //     return true;
        // }
        // else{
        //     int rem=n%3;
        //     if(rem%3==0){
        //         ist true
        //     }
        // }
        if(n<=3){
            return true;
        }
        return n%4!=0?true:false;
    }
}