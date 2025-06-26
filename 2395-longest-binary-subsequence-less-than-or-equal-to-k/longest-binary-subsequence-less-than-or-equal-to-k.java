class Solution {
    public int longestSubsequence(String s, int k) {
        int n = s.length()-1;
        int power_value=1; //2 power 0
        int sub_length = 0;
        
        for(int i = n; i>=0; i--){
            if(s.charAt(i)=='0'){
                sub_length++;

            }else if(power_value<=k){
                k-=power_value;
                sub_length++;

            }

            if(power_value<=k){
                power_value = power_value << 1;
            }
        }

        return sub_length;
        
    }
}