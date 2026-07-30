class Solution {
    public int minimumPushes(String word) {
        int f[]=new int[26];
        for(int i=0;i<word.length();i++){
            f[word.charAt(i)-'a']++;
        }
        int ans=0;
        Arrays.sort(f);
        for(int i=25;i>=18;i--){
            ans+=f[i];
        }
        for(int i=17;i>=10;i--){
            ans+=f[i]*2;
        }
        for(int i=9;i>=2;i--){
            ans+=f[i]*3;
        }
        for(int i=1;i>=0;i--){
            ans+=f[i]*4;
        }
        return ans;

    }
}