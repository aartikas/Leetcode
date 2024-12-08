class Solution {
    public int maxVowels(String s, int k) {

        int max_vowel = 0;
        int count = 0;
        
        for(int i = 0; i<k;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='o'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u') count++;
            max_vowel = Math.max(count,max_vowel);
        }

        if(count==k) return k;

        int j = k;
        for(int i = 0; i<s.length()-k;i++){
            char ch1 = s.charAt(i);
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
                count--;
            }
            char ch2 = s.charAt(j);
            j++;
            if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u'){
                count++;
            }

            if(count==k) return k;
            if(count>max_vowel) max_vowel = count;

        }

        return max_vowel;
    }
}