class Solution {
    public int findNumbers(int[] nums) {
        int s=0,c=0;
       for(int i=0;i<nums.length;i++ ){
        s=nums[i];
        String a=Integer.toString(s);
    if(a.length()%2==0){ c++;}
       
       }
       return c;
    }
}