/*

Problem URL = https://leetcode.com/problems/continuous-subarrays/description/

class Solution {
    public long continuousSubarrays(int[] nums) {
        
        TreeMap<Integer, Integer> map = new TreeMap<>();

        long ans = 0;
        int start = 0;

        for(int end = 0; end < nums.length; end++){
            
            int val = nums[end];
            map.put(val, map.getOrDefault(val, 0) + 1);

            while((start < end) && (Math.abs(map.lastKey() - map.firstKey()) > 2)){
                 
                map.put(nums[start], map.get(nums[start]) - 1);
                if(map.get(nums[start]) == 0)
                   map.remove(nums[start]);

                start++;               
 
            }

            ans = ans + (end - start + 1);

        }
        
        return ans;

    }
}

*/