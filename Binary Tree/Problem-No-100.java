/*
 
Problem URL = https://leetcode.com/problems/same-tree/description/

class Solution {

    boolean ans=true;

    void find(TreeNode p,TreeNode q)
    {

        if((p != null && q == null) || (p == null && q != null))
        {
            ans=false;
            return;
        }

        if(p == null && q == null)
           return;

        if(p.val != q.val)
        {
            ans=false;
            return;
        }

        find(p.left,q.left);
        find(p.right,q.right);

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p==null && q==null)
           return true;

        if(p==null || q==null)
           return false; 

        find(p,q);

        return ans;   

    }
}

*/