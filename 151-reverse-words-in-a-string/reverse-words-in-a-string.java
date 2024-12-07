class Solution {
    public String reverseWords(String s) {
  // Step 1: Split the string into words after trimming leading/trailing spaces
        String[] stringArray = s.trim().split("\\s+"); // Split by one or more spaces

        // Step 2: Use StringBuilder to reverse the order of words
        StringBuilder result = new StringBuilder();

        // Step 3: Append words in reverse order
        for (int i = stringArray.length - 1; i >= 0; i--) {
            result.append(stringArray[i]);
            if (i > 0) { // Add a space between words (but not at the end)
                result.append(" ");
            }
        }

        // Step 4: Return the final result
       return result.toString();
    }
}