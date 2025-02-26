class Solution {
    public int subsetXORSum(int[] nums) {
        int orSum = 0;
        for (int num : nums) {
            orSum |= num;  // Compute OR of all elements
        }
        return orSum * (1 << (nums.length - 1));  // Multiply by 2^(n-1)
    }
}
