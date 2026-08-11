class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0],i;
        for(i=1;i<nums.length;i++){
            if(nums[i]-1==nums[i-1])
            sum+=nums[i];
            else
            break;
        }
        Arrays.sort(nums);
        int ans=sum;
        for(i=0;i<nums.length;i++){
            if(nums[i]<ans)
            continue;
            if(nums[i]==ans)
            ans++;
            else
            break;
        }
        return ans;
    }
}