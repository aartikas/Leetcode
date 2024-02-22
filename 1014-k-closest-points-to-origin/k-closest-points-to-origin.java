class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, new XYZ());
        int[][] ans = new int[k][2];

        for(int i = 0 ; i <k ;i++){
            ans[i] = points[i];

        }

        return ans;
        
    }
}

class XYZ implements Comparator<int[]>{
    @Override
    public int compare(int[] a , int[] b){
        int x1 = a[0];
        int y1 = a[1];
        int d1 = (x1*x1)+(y1*y1);
        int x2 = b[0];
        int y2 = b[1];
        int d2 = (x2*x2)+(y2*y2);

        return d1-d2;
    } 

}