class Solution {
    public int get_discount(int i, int []prices){
        int j = i+1;
        int ans = prices[i];
        while(j<prices.length){
            if(prices[j]<=prices[i]){
                ans-=prices[j];
                break;

            }
            j++;
        }
        return ans;
    }
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int [] dis_prices = new int[n];
        for(int  i =0; i<n;i++){
            dis_prices[i] = get_discount(i, prices);
        }
        return dis_prices;
    }
}