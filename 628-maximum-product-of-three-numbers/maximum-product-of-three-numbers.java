class Solution {
    public int maximumProduct(int[] nums) {
        int max=1;
        Arrays.sort(nums);
        int l=nums.length;
       int m1 = nums[l - 1] * nums[l - 2] * nums[l - 3]; 
        int m2 = nums[0] * nums[1] * nums[l - 1];

        //return Math.max(maxProduct1, maxProduct2); 
       return m1>m2?m1:m2;
    }
}