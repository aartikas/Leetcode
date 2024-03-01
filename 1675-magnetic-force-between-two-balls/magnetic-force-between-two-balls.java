class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int N = position.length;
        int l = 0;
        int h = position[N-1];
        int ans = 0;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(ispossible(position,m,mid)){
                ans = mid;
                l = mid+1;
            }else{
                h = mid-1;
            }

        }
        return ans;
        
    }

    public boolean ispossible(int[] position,int m,int mid){
        int cnt=1;
        int lst = position[0];
        for(int i =1;i<position.length;i++){
            if(position[i]-lst>=mid){
                lst = position[i];
                cnt++;
            }
        }

        return cnt>=m;
    }
}