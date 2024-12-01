class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //Create a Hashmap with elements and their respective frequencies
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        //Get the frequencies and add then to the Hashset, if it already
        //contains the said number then return false
        HashSet<Integer> freq = new HashSet<>();
        for(int value : map.values()){
            if(!freq.add(value)){
                return false;
            }
        }
        return true;
    }
}