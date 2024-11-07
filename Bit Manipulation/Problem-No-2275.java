/*

Problem URL = https://leetcode.com/problems/largest-combination-with-bitwise-and-greater-than-zero/description/

class Solution {

    public void findSetBits(int val, int bits[]) {

        int count = 0;

        while(val > 0){
            
            if((val & 1) == 1)
               bits[count]++;

            val = val >> 1;
            count++;

        }
            
    }

    public int largestCombination(int[] candidates) {
        
        int ans = 0;
        
        int bits[] = new int[32];

        for(int val: candidates)
           findSetBits(val, bits);
        
        for(int val: bits)
           ans = Math.max(val, ans);
        
        return ans;

    }
}

*/
