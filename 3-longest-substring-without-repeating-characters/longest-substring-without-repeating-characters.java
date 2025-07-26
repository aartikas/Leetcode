class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256]; // ASCII character set
        int n = s.length();

        int i = 0, maxlen = 0;

        for (int j = 0; j < n; j++) {
            char ch = s.charAt(j);

            // If character was seen and is within the current window
            if (hash[ch] > 0 && hash[ch] > i) {
                i = hash[ch];
            }

            maxlen = Math.max(maxlen, j - i + 1);
            hash[ch] = j + 1; // Store index + 1 to avoid 0-index confusion
        }

        return maxlen;
    }
}
