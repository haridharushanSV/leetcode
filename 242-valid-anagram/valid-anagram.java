class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
                Arrays.sort(b);
                String s1=new String(a);
                                String s2=new String(b);

                System.out.println(s1);
                return s1.equals(s2);



      
    }
}