class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0,i,j;
        for(i=0;i<s.length()-1;i++){
            int arr[]=new int[26];
            arr[s.charAt(i)-'a']++;
            for(j=i+1;j<s.length();j++){
                if(arr[s.charAt(j)-'a']==2)
                break;
                arr[s.charAt(j)-'a']++;
            }
            max=Math.max(max,(j-i));
        }
        return max;
    }
}