class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     
        int[][] b=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
               int k=0;
            for(int j=image[0].length-1;j>=0;j--){
              b[i][k]=  image[i][j];
              k++;
            }
        }
          for(int i=0;i<image.length;i++){
              
            for(int j=0;j<image[0].length;j++){
              if(b[i][j]== 1){
                b[i][j]=0;
              }
              else{
                b[i][j]=1;
              }
              
            }
        }
        return b;
    }
}