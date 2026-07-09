class Solution {
    public int longestArithmetic(int[] nums) {
        int diff=nums[1]-nums[0],ind=0,max=0,done=-1,p=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==diff){
                continue;
            }
            else if(i+2<nums.length&&done==-1&&nums[i+2]-nums[i]==2*diff){
                done=1;
                p=i+2;
                i++;
            }
            else
            {
                if(done==-1)
                max=Math.max(max,i-ind+2);
                max=Math.max(max,i-ind+1);
                diff=nums[i+1]-nums[i];
                if(done==1){
                ind=p;
                i=p-1;
                }
                else
                ind=i;
                done=-1;
            }
        }
        max=Math.max(max,nums.length-ind);
        if(done==-1)
        max=Math.max(max,Math.min(nums.length,nums.length-ind+1));
        diff=nums[nums.length-1]-nums[nums.length-2];ind=nums.length-1;done=-1;
        for(int i=nums.length-2;i>0;i--){
            if(nums[i]-nums[i-1]==diff){
                continue;
            }
            else if(i-2>=0&&done==-1&&nums[i]-nums[i-2]==2*diff){
                done=1;
                i--;
            }
            else
            {
                if(done==-1)
                max=Math.max(max,ind-i+2);
                done=-1;
                max=Math.max(max,ind-i+1);
                diff=nums[i]-nums[i-1];
                ind=i;
            }
        }
        max=Math.max(max,ind+1);
        if(done==-1)
        max=Math.max(max,Math.min(nums.length,ind+2));
        return max;
    }
}