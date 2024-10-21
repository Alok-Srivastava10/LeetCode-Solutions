/*
 
  Problem URL = https://leetcode.com/problems/find-the-sequence-of-strings-appeared-on-the-screen/
  
  TC = 0(n)
  SC = 0(n) 

  class Solution {
    public List<String> stringSequence(String target) {
        
        List<String> ans = new ArrayList<>();

        int idx = 0;
        char charArr[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        String curr_val = "";

        while(idx < target.length()){

            char curr_char = target.charAt(idx);

            for(int i = 0 ; i <= 25 ; i++){
               
                char ch = charArr[i];
                    
                curr_val = target.substring(0, idx) + ch;
                ans.add(curr_val);

                if(curr_char == ch)
                  break;

            }

            idx++;

        }

        return ans;

    }
}

 */
