class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<Integer>[] adj= new  ArrayList[n];
        for(int i = 0; i<n;i++){
            adj[i] = new ArrayList<>();
        }

        for(int[] e : edges){
            int node1 = e[0];
            int node2 = e[1];

            adj[node1].add(node2);
            adj[node2].add(node1);

        }

        int[] count = new int[1];

        dfs(0,-1, adj, values, k, count);
        return count[0];
        
    }

    public int dfs(int cNode, int pNode, List<Integer>[] adj, int []node_Val, int k, int[] count){
        int sum = 0;

        for(int neibournode: adj[cNode]){
            if(neibournode!=pNode){
                sum +=dfs(neibournode,cNode,adj,node_Val,k,count);
                sum = sum%k;
            }
        }
        sum += node_Val[cNode];
        sum %= k;
        if(sum==0){
            count[0]++;
        }

        return sum;
    }
}