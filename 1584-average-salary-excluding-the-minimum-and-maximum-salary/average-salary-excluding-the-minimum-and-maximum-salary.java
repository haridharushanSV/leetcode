class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int c=0;
        double s=0;
        for(int i=1;i<salary.length-1;i++){
            c++;
            s+=salary[i];
        }
        return s/c;
    }
}