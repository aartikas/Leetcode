class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        int luckyint = -1;
        for(int num: arr){
            hp.put(num, hp.getOrDefault(num,0)+1);
        }
        // for(Map.Entry<Integer,Integer> map : hp.entrySet()){
        //     int key = map.getKey();
        //     int value  = map.getValue();
        //     if(key==value)count++;
        // }
        // return count;
        for(int key: hp.keySet()){
            if(key==hp.get(key)){
                luckyint=key;
            }

        }

        return luckyint;

        
    }
}