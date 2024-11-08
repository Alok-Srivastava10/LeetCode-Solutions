/*

Problem URL = https://leetcode.com/problems/count-good-nodes-in-binary-tree/

class Solution {
    
    public int find(TreeNode root, int Prev){
         
        if(root == null)
           return 0;

        int currVal = root.val;

        int leftAns = 0;
        int rightAns = 0;
        boolean isGood = false;

        if(currVal >= Prev){
            
            isGood = true;
            leftAns = find(root.left, currVal);
            rightAns = find(root.right, currVal);

        }

        else{
           
            leftAns = find(root.left, Prev);
            rightAns = find(root.right, Prev);

        }

        return (isGood) ? leftAns + rightAns + 1 : leftAns + rightAns;

    }

    public int goodNodes(TreeNode root) {
        
        return find(root, root.val);

    }
}

*/
