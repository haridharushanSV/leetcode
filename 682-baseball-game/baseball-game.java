class Solution {
    public static boolean isInteger(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}

    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int b=st.pop();
                int c=b+st.peek();
                st.push(b);
                st.push(c);
            }
           
             
              else  if(operations[i].equals("D")){
                    int a=st.peek();
        
                    st.push(a*2);
                }
                 else  if(operations[i].equals("C")){
                    st.pop();
                }
                else{
                      if (isInteger(operations[i])) {
    st.push(Integer.parseInt(operations[i]));}
                }
            
        }
        System.out.println(st);
         int s = 0;
        for (int k : st) {
            s += k;
        }
        return s;
    }
}