class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        ans=find(candidates,target,0,0,curr,ans);
        return ans;
    }
    List<List<Integer>> find(int arr[],int target,int start,int sum,List<Integer> curr,List<List<Integer>> ans){
        if(sum==target){
            ans.add(new ArrayList<>(curr));
            return ans;
        }
        for(int i=start;i<arr.length;i++){
            if(arr[i]==-1||arr[i]+sum>target||(i>0&&arr[i]==arr[i-1]))
            continue;
            int num=arr[i];
            curr.add(num);
            arr[i]=-1;
            find(arr,target,i+1,sum+num,curr,ans);
            arr[i]=num;
            curr.removeLast();
        }
        return ans;
    }
}