/*

 Problem URL = https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/


 class Solution {
    
    int find(String str, HashSet<String> map, int index){

        if(index >= str.length())
            return 0;

        int ans = 0;
        String val = "";

        for(int idx = index ; idx < str.length() ; idx++){
            
            val = val + str.charAt(idx);

            if(!map.contains(val)){
                
                map.add(val);
                ans = Math.max(ans, find(str, map , idx + 1) + 1);
                map.remove(val);

            }

        }

        return ans;

    }

    public int maxUniqueSplit(String s) {
        
       HashSet<String> map = new HashSet<>();

       return find(s, map, 0);

    }
}

 */