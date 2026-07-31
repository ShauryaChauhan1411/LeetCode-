class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int[26];
        int i;
        for(i=0;i<word.length();i++)
        {
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        int ans=0;
        for(i=25;i>17;i--)
        {
         ans+=freq[i];
        }
        for(i=17;i>9;i--)
        {
            ans+=(freq[i]*2);
        }
        for(i=9;i>1;i--)
        {
            ans+=(freq[i]*3);
        }
        ans+=(freq[1]+freq[0])*4;
        return ans;
    }
}