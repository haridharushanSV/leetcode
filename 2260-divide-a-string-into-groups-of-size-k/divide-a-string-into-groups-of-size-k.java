class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            temp.append(s.charAt(i));

            if (temp.length() == k) {
                result.add(temp.toString());
                temp.setLength(0); // clear the builder
            }
        }

        // Fill the last chunk if it's not complete
        if (temp.length() > 0) {
            while (temp.length() < k) {
                temp.append(fill);
            }
            result.add(temp.toString());
        }

        return result.toArray(new String[0]);
    }
}
