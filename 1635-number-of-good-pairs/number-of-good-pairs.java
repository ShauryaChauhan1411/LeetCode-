class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(map1.get(nums[i])!=null){
                ans+=map1.get(nums[i]);
            map1.put(nums[i],map1.get(nums[i])+1);
            }
            else
            map1.put(nums[i],1);
        }
        return ans;
    }
}