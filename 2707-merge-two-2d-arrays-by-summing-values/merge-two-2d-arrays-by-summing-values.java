class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0;
        int j = 0;
        List<int[]> mergeList = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            int id1 = nums1[i][0], val1 = nums1[i][1];
            int id2 = nums2[j][0], val2 = nums2[j][1];
            if (id1 < id2) {
                mergeList.add(new int[] { id1, val1 });
                i++;
            } else if (id2 < id1) {
                mergeList.add(new int[] { id2, val2 });
                j++;
            } else {
                mergeList.add(new int[] { id1, val1 + val2 });
                i++;
                j++;
            }
        }
        while (i < nums1.length) {
            mergeList.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            mergeList.add(nums2[j]);
            j++;
        }
        int[][] result = new int[mergeList.size()][2];
        for (int k = 0; k < mergeList.size(); k++) {
            result[k] = mergeList.get(k);
        }
        return result;
    }
}