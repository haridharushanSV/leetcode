class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] a=new int[nums1.length]; 
        for (int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                   for(int k=j;k<nums2.length;k++){
                        if(nums1[i]<nums2[k])
                        {
                                 a[i]=nums2[k];
                                 break;
                        }
                        else
                        {
                         a[i]=-1;
                        }
                    }
                }
            }
        }
        return a;
    }
}