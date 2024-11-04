/*

Problem URL = https://leetcode.com/problems/equal-row-and-column-pairs/

class Solution {
    public int equalPairs(int[][] grid) {
        
        int ans = 0;
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for(int i = 0; i < grid.length; i++){

            String val = "";

            for(int j = 0; j < grid[0].length; j++)
               val = val + Integer.toString(grid[i][j]) + "->";

            if(map1.containsKey(val))
               map1.put(val, map1.get(val) + 1);

            else
               map1.put(val, 1);

        }

        for(int i = 0; i < grid.length; i++){

            String val = "";

            for(int j = 0; j < grid[0].length; j++)
               val = val + Integer.toString(grid[j][i]) + "->";

            if(map2.containsKey(val))
               map2.put(val, map2.get(val) + 1);

            else
               map2.put(val, 1);

        }

        for(Map.Entry<String, Integer> ele : map1.entrySet()){
            
            String Key = ele.getKey();
            int Value = ele.getValue();

            if(map2.containsKey(Key))               
                ans = ans + map2.get(Key) * Value;
                          
        }
              

        return ans;

    }
}

*/
