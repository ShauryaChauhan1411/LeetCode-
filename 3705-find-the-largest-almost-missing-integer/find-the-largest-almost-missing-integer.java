class Solution {
    public int largestInteger(int[] nums, int k) {
        int count1=0,count2=0,max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[0])
            count1++;
            if(nums[i]==nums[nums.length-1])
            count2++;
            max=Math.max(max,nums[i]);
        }
        int m1=nums[0],m2=nums[nums.length-1];
        if(k==nums.length)
        return max;
        if(k==1){
            int max1=-1;
            for(int i=0;i<nums.length;i++){
                int c=1;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]!=-1&&nums[j]==nums[i])
                    {
                        c++;
                        nums[j]=-1;
                    }
                }
                if(c==1)
                max1=Math.max(max1,nums[i]);
            }
            return max1;
        }
        if(count1>1)
        m1=-1;
        if(count2>1)
        m2=-1;
        return Math.max(m1,m2);
    }
}