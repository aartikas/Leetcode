class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n  = words.length;
        int[] ans = new int[n];
        for(int i = 0 ; i <n; i++){
            int slen = words[i].length();
            if((words[i].charAt(0)=='a'|| 
                words[i].charAt(0)=='e'||
                words[i].charAt(0)=='i'||
                words[i].charAt(0)=='o'||
                words[i].charAt(0)=='u') &&  
                (words[i].charAt(slen-1)=='a' ||
                words[i].charAt(slen-1)=='e'|| 
                words[i].charAt(slen-1)=='i'||
                words[i].charAt(slen-1)=='o'||
                words[i].charAt(slen-1)=='u'))
                
               ans[i] = 1;
            }
            for(int i =1; i<n ;i++){
                ans[i] +=ans[i-1];
            }
            int index = 0;
            int [] output = new int[queries.length];
            for(int j = 0; j<queries.length;j++){
                int st = queries[j][0];
                int end = queries[j][1];
                if(st==0){
                    output[index++] = ans[end];
                }else{
                    output[index++] = ans[end] - ans[st-1];
                }
                
            }
            return output;

          
        }
        
    
}