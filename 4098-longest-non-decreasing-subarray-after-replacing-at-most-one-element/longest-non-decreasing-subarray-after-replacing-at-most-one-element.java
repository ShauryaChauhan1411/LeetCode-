class Solution {
    public int longestSubarray(int[] nums) {
        int done=-1,k=1,max=0,ind=0;
        for(int i=1;i<nums.length;i++){
            if(done==1&&nums[i]<nums[i-1])
            {
                max=Math.max(max,k);
                done=-1;
                k=1;
                i=ind-1;
            }
            else if(nums[i]>=nums[i-1])
            k++;
            else if(i!=nums.length-1&&nums[i+1]>=nums[i-1])
            {
                ind=i+1;
                done=1;
                k+=2;
                i++;
            }
            else{
                max=Math.max(max,k+1);
                k=1;
                if(done==1)
                i=ind-1;
                else
                ind=i; // Keeps ind tracking the current start point
            }
        }
        max=Math.max(max,k);
        
        // Running your exact logic from last to start to handle the other side
        int done2=-1,k2=1,max2=0,ind2=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(done2==1&&nums[i]>nums[i+1])
            {
                max2=Math.max(max2,k2);
                done2=-1;
                k2=1;
                i=ind2+1;
            }
            else if(nums[i]<=nums[i+1])
            k2++;
            else if(i!=0&&nums[i-1]<=nums[i+1])
            {
                ind2=i-1;
                done2=1;
                k2+=2;
                i--;
            }
            else{
                max2=Math.max(max2,k2+1);
                k2=1;
                if(done2==1)
                i=ind2+1;
                else
                ind2=i;
            }
        }
        max2=Math.max(max2,k2);

        return Math.max(max, max2); // Subtracted 1 to account for removing an element
    }
}