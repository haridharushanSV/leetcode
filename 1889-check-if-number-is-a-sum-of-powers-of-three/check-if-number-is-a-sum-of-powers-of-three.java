class Solution {
    public boolean checkPowersOfThree(int n) {
        String s = Integer.toString(n, 3);
        
        return !s.contains("2");
    }
}