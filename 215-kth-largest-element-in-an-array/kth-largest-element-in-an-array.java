class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min_heap = new PriorityQueue<Integer> ();
        for(int i = 0; i<k; i++){
            min_heap.add(nums[i]);
        }
        for(int i = k; i<nums.length; i++){
            if(nums[i]>min_heap.peek()){
                min_heap.poll();
                min_heap.add(nums[i]);
            }
        }
        return min_heap.peek();
    }
}