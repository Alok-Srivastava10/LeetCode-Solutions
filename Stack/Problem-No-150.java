/* 

Problem URL = https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

class Solution {

    boolean isOperator(String val){

        if(val.equals("*") || val.equals("/") || val.equals("+") || val.equals("-"))
           return true;

        return false; 
 
    }

    public int evalRPN(String[] tokens) {
        
        Stack<String> st = new Stack<>();
        int ans = 0;
        
        for(int idx = 0; idx < tokens.length; idx++){

            String str = tokens[idx];

            if(isOperator(str)){
               
                int b = Integer.parseInt(st.pop());
                int a = Integer.parseInt(st.pop());

                if(str.equals("+"))  
                    st.push(Integer.toString(a + b));
                
                else if(str.equals("-"))
                    st.push(Integer.toString(a - b));

                else if(str.equals("*"))
                    st.push(Integer.toString(a * b));

                else
                   st.push(Integer.toString(a / b));
                
            }

            else
              st.push(str);

        }
        
        return Integer.parseInt(st.pop());
        
    }
}

*/