class Solution {
    public boolean isPalindrome(String s) {
               String newStr =s.replaceAll("[\\s\\p{Punct}\\W_]", "").toLowerCase();
        StringBuilder str=new StringBuilder(newStr);
        boolean ist=false;
        str.reverse();
        String a=str.toString();
        if(newStr.equals(a)||newStr.equals(" ")){
            ist= true;
        }
return ist;
    }
}