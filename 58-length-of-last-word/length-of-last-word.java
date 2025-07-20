class Solution {
    public int lengthOfLastWord(String st) {
        String s = st.trim();
        int count = 0;

        int n = s.length();
        for(int i = n-1; i>=0; i--){
            if(s.charAt(i)!=' '){
                count++;

            }else{
                break;
            }
        }
        return count;
        
    }
}