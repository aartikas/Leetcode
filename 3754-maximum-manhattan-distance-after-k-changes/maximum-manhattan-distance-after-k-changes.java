class Solution {
    public int maxDistance(String s1, int k) {
        int ans = 0;
        int n = 0, s = 0, e = 0, w= 0;
        for( char it: s1.toCharArray()){
            switch(it){
            case 'N':n++; break;
            case 'S':s++; break;
            case 'E':e++; break;
            case 'W':w++; break;

        }
        //North South Modification
        int t1 = Math.min(Math.min (n,s),k);
        int t2 = Math.min(Math.min(e,w),k-t1);
        ans = Math.max(ans,count(n,s,t1)+count(e,w,t2));
        }
        return ans;
    }

    public int count(int d1, int d2, int times){
        return Math.abs(d1-d2)+2*times;
    }

        
    
}