class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0],max=nums[0];
        int ans=1;
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=2;i<=min;i++){
            if(min%i==0&&max%i==0)
            ans=i;
        }
        return ans;
    }
}