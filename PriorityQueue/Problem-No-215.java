/*

Problem URL = https://leetcode.com/problems/kth-largest-element-in-an-array/

TC = 0(n lok(k))
SC = 0(k)

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        //Created a min Heap of Size k
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        

        //Inserting the Firt K value in the Heap so as to save space
        for(int idx = 0; idx < k; idx++)
           pq.add(nums[idx]);

        for(int idx = k; idx < nums.length; idx++){
          
           int val = nums[idx];

           if(val > pq.peek()){
               
               pq.poll();
               pq.add(val);

           }
           
        }
        
        return pq.peek();

    }
}

*/
