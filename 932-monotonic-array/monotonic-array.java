class Solution {
    public boolean isMonotonic(int[] nums) {
       boolean a = false;
        boolean b = false;

        for(int i=0;i<nums.length-1;i++){
        //    for(int j=i;j<nums.length-1;j++){
        if(nums[i]<nums[i+1]) {
                   a= true;
                }
                if(  nums[i]>nums[i+1]){
                    b= true;
                }
          //  }
        }
        return !(a && b);
    }
}