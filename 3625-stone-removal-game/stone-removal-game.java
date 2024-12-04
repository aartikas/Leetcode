class Solution {
    public boolean canAliceWin(int n) {
        int count = 10;
        int alice_wins = 0;
        while(count>0 && n>=count){
            n = n-count;
            count--;
            alice_wins++;
        }

        if(alice_wins%2!=0) return true;
        return false;
    }
}