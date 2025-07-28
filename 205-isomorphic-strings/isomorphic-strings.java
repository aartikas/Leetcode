class Solution {
    public boolean isIsomorphic(String st, String tt) {

        HashMap <Character, Character> map = new HashMap<>();

        for(int i = 0 ; i<st.length();i++){
            char s = st.charAt(i);
            char t = tt.charAt(i);
            if(map.containsKey(s)){
                if(map.get(s)!=t){return false;}

            }else{
                if(map.containsValue(t)) return false;
            }
            map.put(s,t);
        }

        return true;
        
    }
}