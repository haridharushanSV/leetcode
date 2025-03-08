class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<Character>();
        StringBuffer sb=new StringBuffer();
      
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
            st.push(s.charAt(i));}
           //  sb.append(st.peek());}
            else{
                 st.pop();
                
            }
        }
        System.out.println(st);

        while(!st.isEmpty()){
           
                sb.append(st.pop());
            
        
        }
        String str=new String(sb.reverse());
        return str;
    }
}