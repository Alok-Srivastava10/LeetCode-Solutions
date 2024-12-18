/* 

Problem URL = https://leetcode.com/problems/single-number/description/

class Solution {
    public int singleNumber(int[] nums) {
        
        int ans = 0;

        for(int idx = 0; idx < nums.length; idx++)
           ans = ans ^ nums[idx];

        return ans;

    }
}

*/
