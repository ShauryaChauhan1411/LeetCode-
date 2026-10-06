class Solution {
    public int minAddToMakeValid(String s) {
        int c=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            c++;
            if(s.charAt(i)==')')
            {
                if(c==0)
                ans++;
                else
                c--;
            }

        }
        return ans+c;
    }
}