class Solution {
    public boolean isSameAfterReversals(int num) {
    int a=num%10;
    return (num < 10) ? true : (num%10 == 0) ? false : true;
}}

   // if(num<10){
    //     return true;
    // }
    // else if(a==0){
    //     return false;
    // }
   // return true;
   // return num<10?a==0:true;