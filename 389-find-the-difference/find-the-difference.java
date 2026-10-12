class Solution {
    public char findTheDifference(String s, String t) {
        int s1[]=new int[26];
        int s2[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            s1[(int)s.charAt(i)-97]++;
            s2[(int)t.charAt(i)-97]++;
        }
       s2[(int)t.charAt(t.length()-1)-97]++;
       for(int i=0;i<26;i++)
       {
        if(s1[i]!=s2[i])
        return (char)(97+i);
       }
       return ' ';
    }
}