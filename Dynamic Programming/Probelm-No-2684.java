/*

Problem URL = https://leetcode.com/problems/maximum-number-of-moves-in-a-grid/description/

class Solution {

    boolean visited(int arr[][],int i,int j,int prev)
    {
        if((i>=0 && i<arr.length) && (j>=0 && j<arr[0].length) && (arr[i][j] > prev))
           return true;

        return false;
    }
     

    int find(int arr[][],int dp[][],int i,int j,int val)
    {
         
        if(dp[i][j]!=-1)
            return dp[i][j];  

        int a=0, b=0, c=0;

        if(visited(arr,i-1,j+1,val))
            a=find(arr,dp,i-1,j+1,arr[i-1][j+1])+1;
            
        if(visited(arr,i,j+1,val))
            b=find(arr,dp,i,j+1,arr[i][j+1])+1;

        if(visited(arr,i+1,j+1,val))
            c=find(arr,dp,i+1,j+1,arr[i+1][j+1])+1;            

        int ans=Math.max(a,Math.max(b,c));
        dp[i][j]=ans;

        return ans;

    }

    public int maxMoves(int[][] grid) {
        
        int dp[][]=new int[grid.length][grid[0].length];
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<dp.length;i++)
          for(int j=0;j<dp[0].length;j++)
            dp[i][j]=-1;

        for(int i=0;i<dp.length;i++)
          ans=Math.max(ans,find(grid,dp,i,0,grid[i][0]));

        return ans;
    }
}

*/