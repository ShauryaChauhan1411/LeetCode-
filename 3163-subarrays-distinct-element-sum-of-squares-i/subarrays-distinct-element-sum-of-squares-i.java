class Solution {
    public int sumCounts(List<Integer> nums) {
        int arr[]=new int[101];
        int ans=0;
        for(int i=0;i<nums.size();i++){
            Arrays.fill(arr,0);
            int c=0;
            for(int j=i;j<nums.size();j++){
                if(arr[nums.get(j)]==0)
                c++;
                arr[nums.get(j)]++;
                ans+=Math.pow(c,2);
            }
        }
        return ans;
    }
}