class Solution {
    public int maxScore(String s) {
        
        int n = s.length();
        int ones = 0;
        for(int i = 0 ; i<s.length(); i++)
            if(s.charAt(i)=='1') ones++;

        int zeros = 0; 
        int score_max = 0;
        for(int i =0; i<n-1; i++){
            if(s.charAt(i)=='0') zeros++;
            else ones--;

            score_max = Math.max(zeros+ones, score_max);
        }

         return score_max;
    }

   
}