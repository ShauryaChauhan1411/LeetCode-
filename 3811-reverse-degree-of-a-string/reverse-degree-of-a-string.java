class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            ans+=(123-(int)s.charAt(i))*(i+1);
        }
        return ans;
    }
}