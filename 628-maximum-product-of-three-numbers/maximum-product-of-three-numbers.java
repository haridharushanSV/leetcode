class Solution {
    public int maximumProduct(int[] nums) {
        int max=1;
        Arrays.sort(nums);
        int l=nums.length;
       int maxProduct1 = nums[l - 1] * nums[l - 2] * nums[l - 3]; // Product of the three largest numbers
        int maxProduct2 = nums[0] * nums[1] * nums[l - 1]; // Product of the two smallest and the largest number

        return Math.max(maxProduct1, maxProduct2); 
       
    }
}