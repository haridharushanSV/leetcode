class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int index = 0;

        // First pass: elements < pivot
        for (int num : nums) {
            if (num < pivot) {
                arr[index++] = num;
            }
        }

        // Second pass: elements == pivot
        for (int num : nums) {
            if (num == pivot) {
                arr[index++] = num;
            }
        }

        // Third pass: elements > pivot
        for (int num : nums) {
            if (num > pivot) {
                arr[index++] = num;
            }
        }

        return arr;
    }
}
