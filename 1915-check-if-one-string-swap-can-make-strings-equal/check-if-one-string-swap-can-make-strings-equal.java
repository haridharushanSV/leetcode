class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c=0;
         if(s2.equals(s1)){
            return true;
        }
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                a.add(i);
                c++;
            }
        }
        if(a.size()!=2){
            return false;
        }
        System.out.println(c);
       
         int   k=a.get(0);
          int  l=a.get(1);
            //o=o+2;
        
       
        return s1.charAt(k)==s2.charAt(l)&&s1.charAt(l)==s2.charAt(k);
    }
}