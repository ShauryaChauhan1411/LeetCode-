class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int arr[]=new int[nums1.length+1];
        long change=k1+k2;
        for(int i=0;i<nums1.length;i++){
            arr[i]=Math.abs(nums1[i]-nums2[i]);
        }
        arr[arr.length-1]=0;
        Arrays.sort(arr);
        int i=arr.length-2;
        int l=arr.length;
        long curr=arr[arr.length-1];
        long mod=0;
        long ans=0;
        while(i>=0&&change>0){
            if(arr[i]==arr[i+1])
            {            }
            else{
                if((curr-arr[i])*(l-i-1)<=change)
                {
                    change-=(l-i-1)*(curr-arr[i]);
                    curr=arr[i];
                }
                else{
                    long diff=(change)/(l-i-1);
                    curr-=diff;
                    mod=(change)%(l-i-1);
                    break;
                }
            }
            i--;
        }
        int k=0;
        for(int j=arr.length-1;j>=0;j--){
            if(k<mod){
                ans+=Math.pow(curr-1,2);
            }
            else if(j>i){
                ans+=Math.pow(curr,2);
            }
            else{
                ans+=Math.pow(arr[j],2);
            }
            k++;
        }
        return ans;
    }
}