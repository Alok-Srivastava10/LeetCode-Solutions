/*

Problem URL = https://leetcode.com/problems/minimum-number-of-removals-to-make-mountain-array/

class Solution {

    public int findLeftSmaller(int arr[], int dp[][], int prev, int curr){
        
        if(curr < 0)
           return 0;

        if(dp[curr][prev] != -1)
           return dp[curr][prev];

        int inc = 0;

        if(arr[curr] < arr[prev])
           inc = findLeftSmaller(arr, dp, curr, curr-1) + 1;

        int ex = findLeftSmaller(arr, dp, prev, curr-1);

        int ans = Math.max(inc, ex);
        dp[curr][prev] = ans;

        return ans;        

    }

    public int findRightSmaller(int arr[], int dp[][], int prev, int curr){
        
        if(curr >= arr.length)
           return 0;

        if(dp[curr][prev] != -1)
           return dp[curr][prev];

        int inc = 0;

        if(arr[curr] < arr[prev])
           inc = findRightSmaller(arr, dp, curr, curr+1) + 1;

        int ex = findRightSmaller(arr, dp, prev, curr+1);

        int ans = Math.max(inc, ex);
        dp[curr][prev] = ans;

        return ans;

    }

    public int minimumMountainRemovals(int[] nums) {
        
        int dp1[][] = new int[nums.length][nums.length];
        int dp2[][] = new int[nums.length][nums.length];
        int leftSmaller[] = new int[nums.length];
        int rightSmaller[] = new int[nums.length];
        int ans = Integer.MAX_VALUE;


        for(int i = 0; i < nums.length; i++)
          for(int j = 0; j < nums.length; j++)
            dp1[i][j] = -1;

        for(int i = 0; i < nums.length; i++)
          for(int j = 0; j < nums.length; j++)
            dp2[i][j] = -1;


        for(int idx = 1; idx < nums.length; idx++)
           leftSmaller[idx] = findLeftSmaller(nums, dp1, idx, idx-1);

        for(int idx = 0; idx < nums.length-1; idx++)
           rightSmaller[idx] = findRightSmaller(nums, dp2, idx, idx+1);

        for(int idx = 1; idx < nums.length-1; idx++){

           int left = leftSmaller[idx];
           int right = rightSmaller[idx];

           if(left > 0 && right > 0){
              
                int total = left + right + 1;

                int deleted = nums.length - total;

                ans = Math.min(ans, deleted);

           }

        }

        return ans;

    }
}

*/
