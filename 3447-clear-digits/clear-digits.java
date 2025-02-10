class Solution {
    public String clearDigits(String s) {
        StringBuilder str=new StringBuilder();
        for(char a:s.toCharArray()){
            if(Character.isDigit(a)){
                if(str.length()>0){
                    str.deleteCharAt(str.length()-1);
                   }   }
                else{
                    str.append(a);
                }
            
        
        }
        return str.toString();
    }
}