class Solution {
    public int largestAltitude(int[] gain) {
        int v=0;
        int u=1;
        int[] ar=new int[gain.length+1];
        ar[0]=0;
       for(int i=0;i<gain.length;i++){
        v+=gain[i];
        ar[u]=v;
        u++;
       } 
       for(int i=0;i<gain.length+1;i++){
       System.out.println(ar[i]);

       }
       Arrays.sort(ar);
       return ar[gain.length];
    }
}