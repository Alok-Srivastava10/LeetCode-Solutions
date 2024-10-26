/*
  
Problem URL = https://leetcode.com/problems/remove-sub-folders-from-the-filesystem/description/

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        
        HashSet<String> map = new HashSet<>();
        List<String> ans = new ArrayList<>();
        boolean isInclude = true;

        Arrays.sort(folder);
        
        for(int idx = 0; idx < folder.length; idx++){
          
            String val = folder[idx];
            
            for(int path = 0; path < val.length(); path++){
                
                char ch = val.charAt(path);

                if(ch == '/'){
                  
                   String substr = val.substring(0, path);

                   if(map.contains(substr)){
                      
                      isInclude = false;
                      break;

                   }

                }

            }

            if(isInclude == true){

                ans.add(val);
                map.add(val);
 
            }
            
            isInclude = true;

        }
        
        return ans;
        
    }
}

*/