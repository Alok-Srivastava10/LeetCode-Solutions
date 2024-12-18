/*

Problem Url = https://leetcode.com/problems/construct-string-with-repeat-limit/

class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        
        StringBuilder sb = new StringBuilder();
        int freq[] = new int[26];
        char ch[] = new char[26];
        int idx = 25;

        for(char val = 'a'; val <= 'z'; val++)
          ch[val - 97] = val;

        for(int i = 0; i < s.length(); i++)
          freq[s.charAt(i) - 97]++;

        while(idx >= 0){

            if(freq[idx] > 0){

                int r = 0;
                int prev = -1;
                int limit = repeatLimit;

                if(sb.length() > 0 && sb.charAt(sb.length() - 1) == ch[idx])
                   limit--;

                while(r != limit){

                    sb.append(ch[idx]);
                    freq[idx]--;
                    r++;

                    if(freq[idx] == 0)
                      break;

                }

                for(int i = idx - 1; i >= 0; i--){

                    if(freq[i] != 0){

                        prev = i;
                        break;

                    }

                }

                if(prev == -1)
                   break;

                sb.append(ch[prev]);
                freq[prev]--;

            }

            else
              idx--;

        }

        return sb.toString();

    }
}

*/