/*

Problem URL = https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

class Solution {
    
    TreeNode find(TreeNode root, TreeNode p, TreeNode q){
       
        if(root == null)
           return null;

        if(root == p)
           return p;

        if(root == q)
           return q;

        TreeNode leftAns = find(root.left, p, q);
        TreeNode rightAns = find(root.right, p, q);

        if(leftAns != null && rightAns != null)
           return root;

        else if(leftAns != null && rightAns == null)
           return leftAns;

        else if(leftAns == null && rightAns != null)
           return rightAns;

        else
           return null;
          
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        return find(root, p ,q);

    }
}

*/
