class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        ans= find(ans,curr,k,n,0,arr);
        return ans;
    }
    List<List<Integer>> find(List<List<Integer>> list,List<Integer> curr,int k ,int n,int sum,int arr[]){
        if(k==0){
            if(sum==n){
                list.add(new ArrayList<>(curr));
            }
            return list;
        }
        int i=1;
        if(curr.size()!=0)
        i=curr.get(curr.size()-1);
        for(;i<10;i++){
            if(arr[i]==-1)
            continue;
            arr[i]=-1;
            curr.add(i);
            find(list,curr,k-1,n,sum+i,arr);
            curr.removeLast();
            arr[i]=0;
        }
        return list;
    }
}