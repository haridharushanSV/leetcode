class Solution {
    public int sumOfSquares(int[] nums) {
        int s=0,sum=0;
        int n=nums.length;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                s=nums[i-1]*nums[i-1];
                sum=s+sum;
            }
        }
        return sum;
    }
}