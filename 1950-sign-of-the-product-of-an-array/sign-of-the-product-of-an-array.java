class Solution {
    public int arraySign(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                return 0;
            }
            if(nums[i]<0){
                c++;
            }
        }
        if(c % 2 == 0){
            return 1;
        }
        else{
            return -1;
        }
    }
}