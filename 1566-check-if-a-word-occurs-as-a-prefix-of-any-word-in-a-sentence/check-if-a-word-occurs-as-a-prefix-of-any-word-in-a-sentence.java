class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] words = sentence.split(" ");
        
        // Iterate over the words
        for (int i = 0; i < words.length; i++) {
            // Check if the word starts with the searchWord
            if (words[i].startsWith(searchWord)) {
                return i + 1; // Return 1-based index
            }
        }

        return -1; 
        
    }
}