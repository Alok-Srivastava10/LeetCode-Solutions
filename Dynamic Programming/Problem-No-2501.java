/*
 
Problem URL = https://leetcode.com/problems/longest-square-streak-in-an-array/description/

class Solution {
    
    public int find(int arr[], int dp[], HashMap<Long, Integer> map, int idx){
         
        if(idx >= arr.length)
           return 0;

        if(dp[idx] != -1)
           return dp[idx];

        int ans = 0;

        if(arr[idx] < 1000){
            
            long val = (long)Math.pow(arr[idx], 2);
                
            if(map.containsKey(val))
                ans = find(arr, dp, map, map.get(val)) + 1;

        }

        dp[idx] = ans;

        return ans;

    }

    public int longestSquareStreak(int[] nums) {
        
        HashMap<Long, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        int ans = 0;

        for(int idx = 0; idx < nums.length; idx++)
           map.put((long)nums[idx], idx);

        for(int idx = 0; idx < nums.length; idx++)
           ans = Math.max(ans, find(nums,dp, map, idx) + 1);

        return (ans > 1) ? ans : -1;
    }
}

*/