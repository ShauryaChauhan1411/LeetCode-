class Solution {
    public int largestInteger(int n, int s) {
        int ans=0;
        while(n>0){
            if(s>=9){
                ans=ans*10+9;
                s-=9;
            }
            else
            {
                ans=ans*10+s;
                s=0;
            }
            n--;
        }
        if(s!=0)
        return -1;
        return ans;
    }
}