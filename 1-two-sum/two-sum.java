class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> nmap = new HashMap<Integer, Integer>();
        int n = nums.length;
        for(int i =0; i< n; i++){
            int complement = target-nums[i];
            if(nmap.containsKey(complement)){
                return new int[]{nmap.get(complement),i};
            }
            nmap.put(nums[i],i);
        }
        return new int[]{};
        
    }
}
