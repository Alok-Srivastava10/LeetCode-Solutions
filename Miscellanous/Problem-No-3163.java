/*

Problem URL = https://leetcode.com/problems/string-compression-iii/

class Solution {
    public String compressedString(String word) {

        StringBuilder Sb = new StringBuilder();
        
        int currFreq = 0;
        int idx = 0;

        while(idx < word.length()){

            char val = word.charAt(idx);
            int i = 0;

            for(i = idx; (i < word.length()) && (word.charAt(i) == val); i++){
                  
                currFreq++;

                if(currFreq == 9){

                    i++;
                    break;

                }

            }
            
            Sb.append((Character.forDigit(currFreq, 10)));
            Sb.append(val);

            currFreq = 0;
            idx = i;

        }


        return Sb.toString();

    }
}

*/