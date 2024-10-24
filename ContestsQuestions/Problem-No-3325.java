/*
   
Problem URL = https://leetcode.com/problems/count-substrings-with-k-frequency-characters-i/

TC = 0(n)
SC = 0(1)

class Solution {

    int find(String str, int k){
           
        int freqArr[] = new int[26];
        int unfitSubstring = 0;
        int start = 0;

        for(int end = 0 ; end < str.length() ; end++){

            int asciiValue = str.charAt(end) - 97;
            freqArr[asciiValue]++;

            while(start <= end && freqArr[asciiValue] >= k) {
                
                int val = str.charAt(start) - 97;
                freqArr[val]--;
                start++;
                
            }

            unfitSubstring += (end-start) + 1;

        }

        return unfitSubstring;

    }

    public int numberOfSubstrings(String s, int k) {
        
        int length = s.length();
        int totalSubstrings = length * (length + 1) / 2;

        return totalSubstrings - find(s, k);
        
    }
}


*/
