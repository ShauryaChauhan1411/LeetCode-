class Solution {
    public String smallestPalindrome(String s) {
        int f[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)-'a']++;
        }
        boolean isodd=false;
        char odd='.';
        if(s.length()%2!=0)
        {
         isodd=true;
         for(int i=0;i<26;i++)
         {
            if(f[i]%2!=0)
            odd=(char)(i+97);
         }
        }
        String ans="";
        for(int i=0;i<26;i++)
        {
            if(f[i]==0)
            continue;
         for(int j=0;j<f[i]/2;j++)
         {
            ans+=(char)(i+97);
         }
        }
        if(isodd)
        {
            ans+=odd;
        }
        String reversed = new StringBuilder(ans).reverse().toString();
        if(isodd)
        ans+=reversed.substring(1,reversed.length());
        else
        ans+=reversed;
        return ans;
    }
}