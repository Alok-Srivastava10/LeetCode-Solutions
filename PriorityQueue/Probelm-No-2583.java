/*
    
  Problem URL = https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/

  class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {

        We will approach the given problem using Level Order Traversal 
        for traversing over all levels and Finding 
        the Kth Largest Sum using Min Heap ...
        
        long sum = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        //Adding Root to the Queue
        q.add(root);

        //Adding null to the Queue to know the Level
        q.add(null);

        while(!q.isEmpty()){
           
           TreeNode curr = q.poll();
                  
            if(curr == null){

                if(pq.size() < k)
                    pq.add(sum);

                else{
                    
                    if(pq.peek() < sum){
                         
                        pq.poll();
                        pq.add(sum);

                    }

                }

                if(!q.isEmpty())
                    q.add(null);

                sum = 0;

            }

           else{

                if(curr.left != null)
                    q.add(curr.left);

                if(curr.right != null)
                    q.add(curr.right);

                sum = sum + curr.val;

           }

        }

        return pq.size() == k ? pq.peek() : -1 ;

    }
}

*/