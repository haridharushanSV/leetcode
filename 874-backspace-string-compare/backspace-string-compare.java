class Solution {
    public boolean backspaceCompare(String s, String t) {
    int n = s.length();
 
//     // To point at position after considering the
//     // backspaces
//     int idx = 0;
//  StringBuilder str=new StringBuilder();
//     for (int i = 0; i < n-1; i++) {
//       if (s.charAt(i+1) == '#') {
// continue;     //   idx++;
//       }
//       else{
//                  str.append(s.charAt(i));

//       }
//       }
//      System.out.println(str);
//     return true;
Stack<Character> st=new Stack<>();
Stack<Character> st2=new Stack<>();

for(int i = 0; i < n; i++){
    if(s.charAt(i)!='#'){
        st.push(s.charAt(i));
    }
    else{
        if(!st.isEmpty()){
            st.pop();
        }
    }
}

for(int i = 0; i < t.length(); i++){
    if(t.charAt(i)!='#'){
        st2.push(t.charAt(i));
    }
    else{
        if(!st2.isEmpty()){
            st2.pop();
        }
    }
}
return st.equals(st2);









  }

    }
