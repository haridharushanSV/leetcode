class Solution {
    public int pivotIndex(int[] nums) {
        int res=0,sum=0;
        for(int i=0;i<nums.length;i++){
            res+=nums[i];}
            for(int j=0;j<nums.length;j++){
                res-=nums[j];
                if(res==sum){
                    return j;
                }
                sum+=nums[j];
            }
        
     return -1;   
    }
}