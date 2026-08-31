class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int k=1,i=1;
        int l=nums.length/3;
        if(nums.length==1||(nums.length<3&&nums[0]!=nums[1]))
        {
            list.add(nums[0]);
            i++;
        }
        for(;i<nums.length;i++){
            if(nums[i]==nums[i-1])
            k++;
            else{
                if(k>l)
                list.add(nums[i-1]);
                k=1;
            }
        }
        if(k>l&&nums.length>1)
        list.add(nums[nums.length-1]);
        return list;
    }
}