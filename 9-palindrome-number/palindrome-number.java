class Solution {
    public boolean isPalindrome(int x) {
       if (x < 0) {
      return false;
    }
    int r = 0;
    int y = x;
    while (x > 0) {
      int rem = x % 10;
      r = r * 10 + rem;
      x /= 10;
    }
    if( r == y){
        return true;
    }
    else{
        return false;
    }
    }
}
    

