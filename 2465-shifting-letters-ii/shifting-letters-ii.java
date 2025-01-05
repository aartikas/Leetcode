class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int N = s.length();
        int[] pf_sum_shift = new int[N + 1]; // Use N+1 to simplify prefix sum computation
        
        // Apply the shift ranges
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];
            
            // Increment start and decrement after end
            pf_sum_shift[start] += (direction == 1) ? 1 : -1;
            if (end + 1 < N) {
                pf_sum_shift[end + 1] += (direction == 1) ? -1 : 1;
            }
        }
        
        // Compute prefix sums to accumulate shifts at each index
        for (int i = 1; i < N; i++) {
            pf_sum_shift[i] += pf_sum_shift[i - 1];
        }

        // Apply the shifts to the string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            // Wrap around using modulo to handle forward and backward shifts
            int shiftValue = pf_sum_shift[i] % 26;
            if (shiftValue < 0) shiftValue += 26; // Handle negative shifts
            
            char newChar = (char) ('a' + (s.charAt(i) - 'a' + shiftValue) % 26);
            result.append(newChar);
        }

        return result.toString();
    }
}
