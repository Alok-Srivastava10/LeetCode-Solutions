/*
 
Problem URL = https://leetcode.com/problems/maximum-swap/description/

class Solution {
    
    //Function for swapping the Values
    void swap(StringBuilder sb, int i, int j){
            
        char ch = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, ch);

    }

    public int maximumSwap(int num) {

        if(num == 0)
          return 0;
        
        StringBuilder sb = new StringBuilder(Integer.toString(num));

        int idx = 0;

        while(idx < sb.length()){
            
            //Converting the current Character Value to its equivalent Integer value
            int val = sb.charAt(idx) - '0';
            int maxi = idx;
            
            if(val != 9){ 
                 
                for(int end = sb.length() - 1; end > idx; end--){
                    
                    int frontValue = sb.charAt(end) - '0';

                    if(frontValue > val){
                       
                       val = frontValue;
                       maxi = end;

                    }

                }

                if(maxi != idx){
                  
                  swap(sb, idx, maxi);
                  return Integer.parseInt(sb.toString());

                }

            }

            idx++;

        }

        return Integer.parseInt(sb.toString());

    }
}

*/