class Solution {
    public int heightChecker(int[] heights) {
        int[] h1=new int [heights.length];
        int c=0;
        for (int i=0;i<heights.length;i++){
            h1[i]=heights[i];
        }
        Arrays.sort(h1);
           for (int i=0;i<heights.length;i++){
            if(h1[i]!=heights[i]){
c++;
            }
        }
        System.out.println(Arrays.toString(h1));
      return c;  
}
    }
    