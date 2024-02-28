class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        if(n>m){
            return findMedianSortedArrays(nums2,nums1);
        }

        if(n==0){
            if(m % 2 ==0){
                return ( (nums2[m/2]+ nums2[(m/2)-1])/2.0);
            }
            return (nums2[m/2]);
        }

        if(m==0){
            if(n % 2 ==0){
                return ( (nums1[n/2]+ nums1[(n/2)-1])/2.0);
            }
            return (nums1[n/2]);
        }

        int  l =0, h = n;
        int req = (n+m+1)/2;

        while(l<=h){
            int c1 = l+(h-l)/2;
            int c2 = req-c1;

            int left1 = (c1==0)?Integer.MIN_VALUE : nums1[c1-1];
            int right1 =(c1==n)? Integer.MAX_VALUE: nums1[c1];

            int left2 = (c2==0)?Integer.MIN_VALUE : nums2[c2-1];
            int right2 =(c2==m)? Integer.MAX_VALUE: nums2[c2];

            if(left1<=right2 && left2<=right1){
                if((n+m)%2==0) 
                    return ((Math.max(left1,left2) + Math.min(right1,right2))/2.0);
                else
                    return Math.max(left1,left2);
            }
            else if(left1>right2){
                h = c1 - 1;
            }else{
                l = c1 + 1;
            }


        }

        return -1;
        
    }
}