class Solution {
    public int maximumCount(int[] nums) {
        int neg=0,pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                    pos++;
            }
            else if(nums[i]<0){
                neg++;
            } 
        }
        int res;
        if(pos>neg){
            return pos;
        }
        return neg;
    }
}