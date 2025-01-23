class Solution {
    public int numWaterBottles(int a, int b) {
int n=a;
while(a>=b){
    int newbot =a/b;
    int rembot =a%b;
    n=n+newbot;
    a=newbot+rembot;

}
return n;
    }
}