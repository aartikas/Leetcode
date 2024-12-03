class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res = new StringBuilder();
        int sp_ind = 0;
        for(int str_iterator=0; str_iterator<s.length();str_iterator++){
            if(sp_ind<spaces.length && str_iterator==spaces[sp_ind]){
                res.append(' ');
                sp_ind++;
            }
            res.append(s.charAt(str_iterator));
        }
        return res.toString();
        
    }
}