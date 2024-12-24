class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        Map<Character, String> chw  = new HashMap<>();

        for(int i = 0 ; i<words.length; i++){
            char c = pattern.charAt(i);
            String word = words[i];

            if(!chw.containsKey(c)){
                if(chw.containsValue(word)) return false;
                chw.put(c,word);
            }
            else if(!chw.get(c).equals(word)) return false;
        }

        return true;
        
    }
}