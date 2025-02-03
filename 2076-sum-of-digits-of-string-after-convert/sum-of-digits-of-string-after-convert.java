
class Solution {
    public int getLucky(String s, int k) {
        int[] a = new int[s.length()];
        String str = "";
        
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i) - 'a' + 1;
            str = str + a[i];
        }
        System.out.println(str);

        int sum1 = 0; 

        for (int o = 0; o < k; o++) { 
            sum1 = 0; 
            for (int j = 0; j < str.length(); j++) {
                int dig = Integer.parseInt(String.valueOf(str.charAt(j)));
                sum1 = sum1 + dig;
                System.out.println(sum1);
            }
            str = Integer.toString(sum1); 
        }

        return sum1; 
    }
}
