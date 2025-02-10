class Solution {
    public char findTheDifference(String s, String t) {
        String a=t+s;
        char res=0;
        for(int i=0;i<a.length();i++){
            char c1=a.charAt(i);
                        

            res=(char)(res^c1);
            System.out.println(res);
        }
        return res;
    }
}