class Solution {
    int index = 0;

    String solve(String s){
        StringBuilder sb = new StringBuilder("");

        while(index < s.length()){
            //  simple character, add to sb
            if(Character.isLetter(s.charAt(index))) sb.append(s.charAt(index));
            //  encounters closing ], return formed string right now
            else if(s.charAt(index) == ']') {
                return sb.toString();
            }
            //  faced digit, get the whole number and recusion
            else if(Character.isDigit(s.charAt(index))){
                //  get the whole number [1, 300]
                int cnt = 0;
                while(Character.isDigit(s.charAt(index))){
                    cnt = cnt*10 + Integer.valueOf(s.charAt(index) - '0');
                    index++;
                }
                index++; //  for opening '['
                //  get the next string inside the brackets
                String next = solve(s);
                //  apend that cnt times
                while(cnt-->0) sb.append(next);
            }
            index++;
        }

        // System.out.println(sb.toString());
        return sb.toString();
    }

    public String decodeString(String s) {
        return solve(s);
    }
}