class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList<String>();
        for(int i=0;i<words.length;++i){    
            String s = words[i].toLowerCase();
            if(s.matches("^[qwertyuiop]*$") || s.matches("^[asdfghjkl]*$") || s.matches("^[zxcvbnm]*$")){
                ans.add(words[i]);
            }
        }
        String[] ret = new String[ans.size()];
       ret = ans.toArray(ret); 
        return ret;
    }
}