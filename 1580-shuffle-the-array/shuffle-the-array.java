class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[] = new int[n];
        int b[] =new int[n];
        int[] c = new int[nums.length];
        int l=0;
        for (int i=0;i<n;i++){
            a[i]=nums[i];
        }
        for (int i=0;i<n;i++){
            b[i]=nums[i+n];
        }
System.out.println(Arrays.toString(b));
        for(int k=0;k<nums.length;k=k+2){
            if(l<n){
                c[k]=a[l];
                c[k+1]=b[l];
                l++;
            }
        }
        return c;
    }
}