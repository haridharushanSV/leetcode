class Solution {
    public boolean isHappy(int n) {
        
        int b=n;
        if(n==1 || n==7) return true;
        else if(n<10) return false;
        else{
            int s=0;
        while(b>0){
            int a=b%10;
            s+=a*a;

            b=b/10;
        }
         //   System.out.println(s);

        return isHappy(s);}
    }
}