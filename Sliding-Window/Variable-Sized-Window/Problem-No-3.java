// Problem URL = https://leetcode.com/problems/longest-substring-without-repeating-characters/

/* 
    
    TC = 0(n)
    SC = 0(1)
  
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start = 0;
        int end = 0;
        int ans = 0;


          Here Map array is acting just like HashMap as in HashMap we can find wheather 
          element is present in HashMap or not using ContainsKey() method here in Map
          array we will check using the flag value of that ascii index -
             
              if flag is set to 0 this means that the value is not present in our answer which
                 we have calculated till now
            
              else value is present and we need to remove from our array so we move start
                   ahead until we delete or unmark the value in our Map array


        int map[] = new int[256];

        for(end = 0 ; end < s.length() ; end++){
             
            char ch = s.charAt(end);

            Calculating the Ascii index of Current Value
            int ascii = ch;


            If Character is already mark in our Map array
            then unmarking it in our Map array


            while((start < end) && (map[ascii] == 1)){

                int idx = s.charAt(start);  
                map[idx] = 0;
                start++ ;

            }
            
            Marking the Current Character in our Map Array
            map[ascii] = 1;
            ans = Math.max(ans,(end-start+1));

        }

        return ans;

    }
}
*/ 