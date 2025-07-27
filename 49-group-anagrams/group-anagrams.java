class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap <String, List<String>> map = new HashMap<>();

        for(int i = 0 ; i<strs.length; i++){
            String temp = strs[i];
            char[] ch  = temp.toCharArray();

            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(temp);
        }

        result.addAll(map.values());
        return result;
        
    }
}