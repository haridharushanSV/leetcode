class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int a=coordinate1.charAt(0)-'a'+1;
                int b=coordinate2.charAt(0)-'a'+1;
                   int a1=coordinate1.charAt(1)-'0'+a;
                int b1=coordinate2.charAt(1)-'0'+b;
            if((a1%2==0 && b1%2==0 )|| (a1%2!=0 && b1%2!=0 )) {
                return true;
            }
else{
    return false;
}
    }
}