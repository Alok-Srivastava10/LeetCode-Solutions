// Problem URL = https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/description/

// class Solution {
       
//     Function for reversing the Bits of Input String

//     StringBuilder findReverse(StringBuilder sb){

//        StringBuilder rev = new StringBuilder();

//        for(int i = sb.length() - 1 ; i >= 0 ; i--){
             
//             char ch = sb.charAt(i);

//             if(ch == '0')
//               rev.append("1");

//             else
//               rev.append("0");

//        }

//        return rev;

//     }

//    Function for joining the Original String with its Reversed Inverted String

//     StringBuilder buildN(StringBuilder sb){

//         StringBuilder rev = findReverse(sb);

//         return sb.append("1").append(rev);

//     }

//     public char findKthBit(int n, int k) {
        
//         if(n == 1)
//           return '0';

//         int count = 1;
//         StringBuilder Prev = new StringBuilder("0");
//         StringBuilder ans = new StringBuilder();

//         while(count <= n){
            
//             ans = buildN(Prev);
//             Prev = ans;
//             count++;

//         }

//         return ans.charAt(k-1);

//     }
// }