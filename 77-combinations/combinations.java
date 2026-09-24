class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> empty=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        ans=find(n,k,empty,ans);
        return ans;
    }
    List<List<Integer>> find(int n,int k,List<Integer> curr,List<List<Integer>> ans){
        if(k==0)
        {
            ans.add(new ArrayList<>(curr));
            return ans;
        }
        int i=1;
        if(curr.size()!=0){
            i=curr.get(curr.size()-1)+1;
        }
        for(;i<=n;i++){
            curr.add(i);
            find(n,k-1,curr,ans);
            curr.removeLast();
        }
        return ans;
    }
}