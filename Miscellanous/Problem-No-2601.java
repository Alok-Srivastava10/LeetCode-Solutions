/*

Problem URL = https://leetcode.com/problems/prime-subtraction-operation/

class Solution {

    List<Integer> find(int n)
    {
        int index=0;
        List<Integer> ans=new ArrayList<>();

        if(n == 1)
          return ans;
          
        ans.add(2);
        int arr[]=new int[n/2-1];

        for(int i=3;i<n;i=i+2)
          arr[index++]=i;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=-1)
            {
                ans.add(arr[i]);
                for(int j=i+arr[i];j<arr.length;j=j+arr[i])
                  arr[j]=-1;
            }
        }

        return ans;
    }

    public boolean primeSubOperation(int[] nums) {
        
        List<Integer> prime=find(1000);
        
        int end=nums.length-1;
        int prev=nums[end];
        end--;

        while(end >= 0)
        {

            if(nums[end] < prev)
            {
                prev=nums[end];
                end--;
            }

            else
            {
                int start=0;
                boolean found=false;
                while(start < prime.size())
                {
                    if((nums[end]-prime.get(start) < prev) && (prime.get(start) < nums[end]))
                    {
                        prev=nums[end]-prime.get(start);
                        found=true;
                        break;
                    }
                    start++;
                }
                
                if(found == false)
                  return false;

                end--;
            }
        }
        
        return true;
    }
}

*/
