class Solution {
    public int countValidWords(String sentence) {
        String[] a=sentence.split(" ");
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i].matches("^(?=[a-z!.,-]*$)(?!.*-.*-)(?!.*[!.,].*[!.,])([a-z]+(-[a-z]+)?[!.,]?|[!.,])$"))
            {
                c++;
            }
        }
        return c;
    }
}