class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> freMap = new HashMap<>();

        for(int num: nums){
            freMap.put(num, freMap.getOrDefault(num,0)+1);
        }
        int maxL = 0;

        for(int num: freMap.keySet()){
            if(freMap.containsKey(num+1)){
                int curr = freMap.get(num)+freMap.get(num+1);
                maxL = Math.max(maxL, curr);
            }
        }

        return maxL;
        
        
    }
}