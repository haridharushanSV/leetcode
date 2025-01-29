class Solution {
public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int num = i;
            boolean isTrue = true; 

            while (num > 0) {
                int dig = num % 10; 
                if (dig == 0 || i % dig != 0) { 
                    isTrue = false; 
                    break; 
                }
                num = num / 10; 
            }

            if (isTrue) {
                ar.add(i); 
            }
        }
        return ar;
    }
}