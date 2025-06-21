class Solution {
    public int minimumDeletions(String word, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : word.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int result = word.length();

        for(int a :map.values()){
            int deleted = 0;
            for(int b: map.values()){
                if(a>b) deleted +=b;
                else if(b>a+k) deleted+=b-(a+k);
            }
            result = Math.min(result,deleted);
        }

        return result;
        
    }
}