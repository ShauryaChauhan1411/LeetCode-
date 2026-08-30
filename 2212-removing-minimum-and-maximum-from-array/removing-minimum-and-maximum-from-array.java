class Solution {
    public int minimumDeletions(int[] nums) {
        int mid=nums.length/2,minind=0,maxind=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[minind])
            minind=i;
            if(nums[i]>nums[maxind])
            maxind=i;
        }
        int right=Math.max(maxind,minind);
        int left=Math.min(maxind,minind);
        return Math.min(right+1,Math.min(nums.length-left,left+nums.length-right+1));
    }
}