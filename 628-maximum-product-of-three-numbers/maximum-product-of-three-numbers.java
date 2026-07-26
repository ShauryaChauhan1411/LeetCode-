class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length-1;
        int ans=Math.max(nums[l]*nums[l-1]*nums[l-2],Math.max(nums[0]*nums[1]*nums[l],Math.max(nums[0]*nums[l]*nums[1],nums[0]*nums[l]*nums[l-1])));
        return ans;
    }
}