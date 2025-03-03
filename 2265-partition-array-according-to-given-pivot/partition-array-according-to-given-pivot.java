class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int k = 0;

        for (int num : nums) {
            if (num < pivot) {
                arr[k++] = num;
            }
        }

        for (int num : nums) {
            if (num == pivot) {
                arr[k++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                arr[k++] = num;
            }
        }

        return arr;
    }
}
