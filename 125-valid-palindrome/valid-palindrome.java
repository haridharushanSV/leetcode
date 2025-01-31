class Solution {
    public boolean isPalindrome(String s) {
               String newStr =s.replaceAll("[\\s\\p{Punct}\\W_]", "").toLowerCase();
           //    String newStr1 =s.replaceAll("[\\s,:;]", "").toLowerCase();
        StringBuilder str=new StringBuilder(newStr);
        boolean ist=false;
        str.reverse();
        String a=str.toString();
        System.out.println(str);
                System.out.println(newStr);
                                System.out.println(str.equals(newStr));


        if(newStr.equals(a)||newStr.equals(" ")){
            ist= true;
        }
return ist;
    }
}