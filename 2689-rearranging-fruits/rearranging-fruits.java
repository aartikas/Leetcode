class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int f : basket1) map.put(f, map.getOrDefault(f,0)+1);
        for(int f : basket2) map.put(f, map.getOrDefault(f,0)+1);
        
        long minVal = Long.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() % 2 !=0) return -1;
            minVal = Math.min(minVal, entry.getKey());
        }

        List<Long> fs = new ArrayList<>();
        Map<Integer, Integer> c1 = new HashMap<>();
        
        for(int f: basket1) c1.put(f, c1.getOrDefault(f,0)+1);

        for( Map.Entry<Integer, Integer> entry: map.entrySet()){
            int f  = entry.getKey();
            int diff  =c1.getOrDefault(f,0) - (entry.getValue()/2);

            for(int i = 0; i<Math.abs(diff); i++){
                fs.add((long)f);
            }
        }
        Collections.sort(fs);
        long tc = 0;
        int s = fs.size()/2;
        for(int i = 0; i<s;i++){
            tc+=Math.min(fs.get(i),2*minVal);
        }        
        return tc;
    }
}