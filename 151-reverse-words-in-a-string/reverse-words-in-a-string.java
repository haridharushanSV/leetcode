class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        String[] str= s.trim().split("\\s+");
        for(int i=0;i<str.length;i++){
            st.push(str[i]);
        }
        StringBuilder sb=new StringBuilder();
   while (!st.isEmpty()) {
            sb.append(st.pop());
            if (!st.isEmpty()) {  // Add space only between words
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}