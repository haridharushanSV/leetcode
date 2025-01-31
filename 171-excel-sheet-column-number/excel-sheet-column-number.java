class Solution {
    public int titleToNumber(String c) {
        int res=0;
       for(int i=0;i<c.length();i++) {
     int val=   c.charAt(i)-'A'+1;
        res=res*26+val;
       }
       return res;
    }
}