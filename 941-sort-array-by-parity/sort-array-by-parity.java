class Solution {
    public int[] sortArrayByParity(int[] num) {
        int j=0;
        int temp=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                temp=num[i];
                num[i]=num[j];
                num[j]=temp;
                j++;
            }
        }
        return num;
    }
}