class Solution {
    public int addDigits(int n) {
        
         
            while(n>=10){
                int num=n;
                int dig=0;
        while(num>0){
            dig+=num%10;
            num=num/10;
        }
        n=dig;
            }


        return n;
    }
}