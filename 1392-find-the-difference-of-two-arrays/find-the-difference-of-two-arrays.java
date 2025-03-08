class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        

         for (int n : nums1) h1.add(n);
        for (int n : nums2) h2.add(n);


         for(int i=0;i<nums2.length;i++){
           
                if(h1.contains(nums2[i])){
                    h1.remove(nums2[i]);
                    h2.remove(nums2[i]);
                }
            }
        
    
     List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(h1)); // Unique to nums1
        result.add(new ArrayList<>(h2)); // Unique to nums2
        
        return result;
    }}
