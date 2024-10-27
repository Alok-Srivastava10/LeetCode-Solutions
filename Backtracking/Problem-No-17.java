/*

Problem URL = https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/


class Solution {
    void find(String arr[],List<String> ans,String s,String x,int index)
    {
    if(index>=s.length())
    {
        ans.add(x);
        return;
    }
    char ch=s.charAt(index);
    int ind=ch-'0';
    String y=arr[ind];
    for(int i=0;i<y.length();i++)
        find(arr,ans,s,x+y.charAt(i),index+1);
    }
    public List<String> letterCombinations(String digits) {
    List<String> ans=new ArrayList();
    if(digits.equals(""))
    return ans;
    String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    find(arr,ans,digits,"",0);
    return ans;
    }
}

*/