class Solution {
    public boolean detectCapitalUse(String word) {
        if(word==word.toUpperCase()){
            return true;
        }
        else if(word==word.toLowerCase()){
            return true;
        }
else if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) 
      {return true; }
      return false;  
    }
}