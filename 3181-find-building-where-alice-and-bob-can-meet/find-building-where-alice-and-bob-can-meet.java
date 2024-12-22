class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int[] ans = new int[queries.length];
        Arrays.fill(ans,-1);

        List<List<int[]>> qdef = new ArrayList<>();

        for(int i =0; i<heights.length;i++){
            qdef.add(new ArrayList<>());
        }
        
        for(int  i = 0; i<queries.length; i++){
            int alice = queries[i][0];
            int bob = queries[i][1];


            //Keep Alice Small in index
            if(alice>bob){
                int temp = alice;
                alice = bob;
                bob = temp;
            } 

            if(alice==bob || heights[alice]<heights[bob]){
                ans[i] = bob;
            } else {
                qdef.get(bob).add(new int[]{heights[alice],i});
            }

        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for(int index = 0; index<heights.length;index++){
            int height=heights[index];
        

        for(int[] q :qdef.get(index)){
            minHeap.add(q);
        }

        while(!minHeap.isEmpty() && minHeap.peek()[0]<height){
            int[] query = minHeap.poll();
            int qind = query[1];
            ans[qind] = index;
        }
        }

        return ans;
        
    }
}