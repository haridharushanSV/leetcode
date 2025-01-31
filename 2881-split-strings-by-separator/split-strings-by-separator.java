import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        
        // Iterate over each word in the input list
        for (String word : words) {
            // Split the word using the separator (converted to a regex string)
            String[] parts = word.split("\\" + separator); // Escape the separator for regex
            
            // Add non-empty parts to the result list
            for (String part : parts) {
                if (!part.isEmpty()) { // Avoid adding empty strings
                    result.add(part);
                }
            }
        }
        
        return result;
    }
}