class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int k=1;
        List<Integer> ans=new ArrayList<>();
        for(int i=nums[0]+1;i<nums[nums.length-1];i++){
            if(nums[k]==i){
                k++;
            }
            else{
                ans.add(i);
            }
        }
        return ans;
    }
}