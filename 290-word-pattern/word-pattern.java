class Solution {
    public boolean wordPattern(String pattern, String str) {
    String[] w = str.split(" ");
    if (w.length != pattern.length())
        return false;
    Map index = new HashMap();
    for (Integer i=0; i<w.length; ++i)
        if (index.put(pattern.charAt(i), i) != index.put(w[i], i))
            return false;
    return true;
}
}