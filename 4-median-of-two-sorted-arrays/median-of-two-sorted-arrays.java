class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int a1 = a.length;
        int b1 = b.length;
        double ans=2.00000;
              int c1 = a1 + b1;
        int[] c = new int[c1];

        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
        Arrays.sort(c);
        double res=0;
        int an1=0,an2=0;
        if(c1%2==0){
            an1=c1/2;
            an2=an1-1;
            res=c[an1]+c[an2];
            res=res/2;
    
        }
        else{
            res=c[c1/2];
           
        }
                System.out.println("" + Arrays.toString(c));


    return res;
    }
}