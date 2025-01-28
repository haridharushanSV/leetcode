class Solution {
    public int fib(int n) {
        int fib1=0,fib2=1,fib3=0;
        if(n<=1) return n;
        for(int i=2;i<=n;i++){
            int temp=fib2;
            fib2=fib1+fib2;
            //System.out.print(fib3);
            fib1=temp;
            //fib2=fib3;
        }
        return fib2;
    }
}