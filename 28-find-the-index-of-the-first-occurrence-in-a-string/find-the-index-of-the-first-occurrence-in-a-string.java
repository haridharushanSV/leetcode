class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length()-needle.length();
        int k=needle.length()-1;
        for(int i=0;i<=n;i++){
     //   System.out.println(haystack.substring(2,2+needle.length()));
if(i==0){
    if(haystack.substring(i,needle.length()).equals(needle)){

                return i;
            }
}
          //  for(int j=0;j<needle.length();j++)
          
          else  if(haystack.substring(i,i+needle.length()).equals(needle)){

                return i;
            }
            
                
            
        }
       return -1; 
    }
}