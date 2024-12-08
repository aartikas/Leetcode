class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        for(int i = 0; i<32; i++){
            int bit_a = (a>>i) & 1;
            int bit_b = (b>>i) & 1;
            int bit_c = (c>>i) & 1;
            if((bit_a | bit_b) != bit_c){
                
                if (bit_c==0 && bit_a==1 && bit_b==1) count = count+2;
                else count++;

            }
        }
        return count;
        
    }
}