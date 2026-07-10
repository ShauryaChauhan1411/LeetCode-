class Solution {
    public int climbStairs(int n, int[] costs) {
        int ans[]=new int[costs.length];
        ans[0]=costs[0]+1;
        int l=costs.length;
        if(l>1){
            ans[1]=costs[1]+Math.min(ans[0]+1,4);
        }
        if(l>2){
            ans[2]=costs[2]+Math.min(ans[0]+4,Math.min(ans[1]+1,9));
        }
        for(int i=3;i<costs.length;i++){
            ans[i]=costs[i]+Math.min(ans[i-2]+4,Math.min(ans[i-1]+1,ans[i-3]+9));
        }
        return ans[costs.length-1];
    }
}