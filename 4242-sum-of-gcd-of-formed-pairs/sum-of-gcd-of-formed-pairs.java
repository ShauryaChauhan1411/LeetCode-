class Solution {
    public long gcdSum(int[] nums) {
        int arr[]=new int[nums.length];
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
            arr[i]=gcd(max,nums[i]);
        }
        Arrays.sort(arr);
        long ans=0;
        for(int i=0;i<arr.length/2;i++)
        {
          ans+=gcd(arr[i],arr[arr.length-i-1]);
        }
        return ans;
    }
    public int gcd(int a,int b)
    {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}