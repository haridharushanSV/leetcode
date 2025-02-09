// class Solution {
//     public long countBadPairs(int[] nums) {
//         int c=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=1+1;j<nums.length;j++){
//              //   if(i<j){
//                 if((j-i)!=(nums[j]-nums[i])){
//                     c++;
//                 }}
//            // }
//         }
//         return c;
//     }
// }
class Solution {

    public long countBadPairs(int[] nums) {
        long badPairs = 0;
        Map<Integer, Integer> diffCount = new HashMap<>();

        for (int pos = 0; pos < nums.length; pos++) {
            int diff = pos - nums[pos];

            // Count of previous positions with same difference
            int goodPairsCount = diffCount.getOrDefault(diff, 0);

            // Total possible pairs minus good pairs = bad pairs
            badPairs += pos - goodPairsCount;

            // Update count of positions with this difference
            diffCount.put(diff, goodPairsCount + 1);
        }

        return badPairs;
    }
}