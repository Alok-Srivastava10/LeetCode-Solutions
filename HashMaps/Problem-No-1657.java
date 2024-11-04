/*

Problem URL = https://leetcode.com/problems/determine-if-two-strings-are-close/description/

class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length() != word2.length())
           return false;

        int arr1[] = new int[26];
        int arr2[] = new int[26];

        List<Integer> occ1 = new ArrayList<>();
        List<Integer> occ2 = new ArrayList<>();

        for(int idx = 0; idx < word1.length(); idx++){
              
            int val = word1.charAt(idx) - 97;
            arr1[val]++;

        }

        for(int idx = 0; idx < word2.length(); idx++){
            
            int val = word2.charAt(idx) - 97;
            
            if(arr1[val] == 0)
               return false;

            arr2[val]++;

        }

        for(int idx = 0; idx < arr1.length; idx++){
           
            occ1.add(arr1[idx]);
            occ2.add(arr2[idx]);

        }

        Collections.sort(occ1);
        Collections.sort(occ2);

        return occ1.equals(occ2) ? true : false;

    }
}

*/