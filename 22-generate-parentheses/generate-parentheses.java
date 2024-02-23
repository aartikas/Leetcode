class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        return generateParantheis_helper("",n,0,0,ans);
        
        
    }

    public List<String> generateParantheis_helper(String s, int n, int open,int close,List<String> ans){
        if(s.length()==2*n){
            ans.add(s);
            return ans;
        }
        if(open<n){
            generateParantheis_helper(s+'(',n ,open+1,close,ans);
        }
        if(close<open){
            generateParantheis_helper(s+')',n ,open,close+1,ans);
        }

        return ans;
    }
}