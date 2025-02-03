class Solution {
    public boolean isValid(String word) {
        return word.matches("^(?=.*[AEIOUaeiou])(?=.*[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz])[A-Za-z0-9]{3,}$");
    }
}