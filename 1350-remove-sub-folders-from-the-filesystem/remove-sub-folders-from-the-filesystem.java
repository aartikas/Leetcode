class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);

        List<String> ans = new ArrayList<>();

        for( String f: folder){
            if(ans.isEmpty()){
                ans.add(f);
            }
            else{
                String prev = ans.get(ans.size()-1);
                if(f.startsWith(prev) && f.length()> prev.length()&& f.charAt(prev.length())=='/'){
                    continue;
                }else{
                    ans.add(f);
                }
            }
        }

        return ans;
        
    }
}