class Solution {
    public String mergeAlternately(String word1, String word2) {
        String a=new String();
        int n=word1.length()>word2.length()?word1.length():word2.length();
        System.out.println(n);
        for(int i=0;i<n;i++){
            if(word1.length()>i){
           a+=word1.charAt(i);}
           if(word2.length()>i){
           a+=word2.charAt(i);}
         //  a+=word2.charAt(i);//}
        }
        return a;
    }
}