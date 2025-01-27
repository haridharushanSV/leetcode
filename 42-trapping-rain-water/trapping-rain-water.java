class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] pre = new int[n];
        int[] post = new int[n];
        int ans = 0;
        pre[0] = height[0];
        post[n-1] = height[n-1];
        for (int i = 1; i < n; i++) {
            pre[i] = Math.max(height[i], pre[i-1]);
            post[n-1-i] = Math.max(height[n-i-1], post[n-i]);
        }
        for (int i = 1; i < n-1; i++) {
            if (Math.min(pre[i-1], post[i+1]) > height[i]) {
                ans += Math.min(pre[i-1], post[i+1]) - height[i];
            }
        }
        return ans;
    }
}