class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }
        int m = nums.length/2;

        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            if(entry.getValue() > m){
                return entry.getKey();
            }
        }
        return 0;
        
        
    }
}