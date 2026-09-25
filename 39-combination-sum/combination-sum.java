class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        return find(ans,curr,candidates,target,0);
    }
    List<List<Integer>> find(List<List<Integer>> ans,List<Integer> curr,int arr[],int target,int ind){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return ans;
        }
        if(target<0){
            return ans;
        }
        for(int i=ind;i<arr.length;i++){
            curr.add(arr[i]);
            find(ans,curr,arr,target-arr[i],i);
            curr.removeLast();
        }
        return ans;
    }
}