// Problem URL = https://leetcode.com/problems/parsing-a-boolean-expression/

/*
class Solution {
    public boolean parseBoolExpr(String expression) {
        
        Stack<Character> st = new Stack<>();

        for(int idx = 0 ; idx < expression.length() ; idx++){
            
            char ch = expression.charAt(idx);
            
            if(ch == ')'){
                    
                int t = 0;
                int f = 0;

                while(!st.empty() && st.peek() != '('){
                    
                        char val = st.pop();

                        if(val == 't')
                            t++;
                        
                        else if (val == 'f')
                            f++;

                } 
                
                st.pop();
                char opr = st.pop();

                if(opr == '&'){
                    
                    if(f > 0)
                      st.push('f');

                    else
                      st.push('t');

                }

                else if(opr == '|'){
                    
                    if(t > 0)
                       st.push('t');

                    else
                       st.push('f');

                }
                
                else{
                    
                    if(t > 0)
                       st.push('f');

                    else
                       st.push('t');

                }


            }

            else if(ch == ',')
              continue;

            else
              st.push(ch);

        }

        char ch = st.pop();
        
        if(ch == 't')
          return true;

        return false;


    }
}
*/