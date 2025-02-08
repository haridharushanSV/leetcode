class Solution {
    public boolean isPerfectSquare(int num) {
        int mid = num/2;

        if(num==1) return true;

        for(int i=1;i<=mid;i++){
            if((i*i)==num) return true;
        }

        return false;
    }
}