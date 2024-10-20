// Problem URL = https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/


/*
    
    TC = 0(n)
    SC = 0(1)
     
    class Solution {
    
    Function for checking wheather character is Vowel or not
    boolean isVowel(char ch){

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;

        return false; 
         
    }

    public int maxVowels(String s, int k) {
        
        int start = 0;
        int end = 0;
        int vowelCount = 0;
        int ans = 0;
        
        //Finding Vowel for First K Sized Window
        for(end = 0 ; end < k ; end ++){
            
            char ch = s.charAt(end);

            if(isVowel(ch))
              vowelCount++;

        }
        
        ans = Math.max(ans, vowelCount);

        //Now Finding for Remaining Windows
        for(end = k ; end < s.length() ; end ++){
           
           char ch = s.charAt(end);           
           char firstWindowCharacter = s.charAt(start);
            
           if(isVowel(firstWindowCharacter))
              vowelCount--;

           if(isVowel(ch))
              vowelCount++;

           start++;
           ans = Math.max(ans, vowelCount);

        }
        
        return ans;
        
    }
}*/