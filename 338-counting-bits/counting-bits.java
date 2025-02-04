class Solution {
    public int[] countBits(int n) {
   // String a=Integer.toBinaryString(n);
   // System.out.println(a);
    int k=0;
    int[] c=new int[n+1];
    int count=0;
    for(int i=0;i<=n;i++){
       String num = Integer.toBinaryString(i);
          System.out.println(num);
 count=0;
       for(int j=0;j<num.length();j++){
       
        if(num.charAt(j)=='1'){
            count++;
        }
        c[k]=count;
        }
       k++;     
    }
     return c;   
    }
}