class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int arr[]=new int[32];
        int c;
        for(int i=0;i<nums.size();i++){
            int num=nums.get(i);
            c=31;
            while(num>0){
                if(num%2==1)
                arr[c]++;
                c--;
                num/=2;
            }
        }
        long ans=0,sum=0;
        int j=0;
        do{
            sum=0;
            for(int i=0;i<32;i++){
                if(arr[i]==0)
                sum*=2;
                else
                {
                    sum=(sum*2)+1;
                    arr[i]--;
                }
            }
            sum%=1000000007;
            ans=(ans+(sum*sum)%1000000007)%1000000007;
            j++;
        }while(j<k&&sum!=0);
        return (int)ans;
    }
}