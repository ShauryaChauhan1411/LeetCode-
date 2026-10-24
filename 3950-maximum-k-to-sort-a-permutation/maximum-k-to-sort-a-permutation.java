class Solution {
    public int sortPermutation(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i];
        }
        int ans=-1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=nums[i])
            {
                ans&=nums[i];
            }
        }
        return Math.max(ans,0);
    }
}