class Solution {
    public int[] diStringMatch(String s) {
        int[] arr=new int[s.length()+1];
        int k=0;
        int l=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
            arr[i]=k++;}
            else{
                arr[i]=l--;
            }
        }
        arr[s.length()]=k;
        return arr;
    }
}