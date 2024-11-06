/*
 
Problem URL = https://leetcode.com/problems/find-if-array-can-be-sorted/

class Solution {
    
    //Function for finding Set Bits of given input value
    public int findSetBits(int val){
      
       int count = 0;

        while(val > 0){
            
            if((val&1) == 1)
               count++;

            val = val >> 1;

        }

        return count;

    }

    public boolean canSortArray(int[] nums) {
        
        int setBits[] = new int[256];

        for(int val = 1; val <= 256; val++)
           setBits[val-1] = findSetBits(val);
        
        for(int idx = 0; idx < nums.length; idx++){
           
            int currVal = nums[idx];
            int bits = setBits[currVal-1];

            for(int j = idx+1; j < nums.length; j++){
                    
                int val = nums[j];

                if(currVal > val){
                    
                    if(setBits[val-1] != bits) 
                       return false; 

                } 
                    
            }

        }

        return true;

    }
}

*/
