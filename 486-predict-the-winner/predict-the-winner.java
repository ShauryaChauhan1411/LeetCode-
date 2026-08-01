class Solution {
    public boolean predictTheWinner(int[] nums) {
        return result(nums,0,0,0,nums.length-1,1);
    }
    boolean result(int arr[],int scorea,int scoreb,int low,int high,int chance){
        if(low>high)
        return scorea>=scoreb;
        if(chance==1)
        {
            chance=-1;
            return result(arr,scorea+arr[low],scoreb,low+1,high,chance)||result(arr,scorea+arr[high],scoreb,low,high-1,chance);
        }
        else{
            chance=1;
            return result(arr,scorea,scoreb+arr[low],low+1,high,chance)&&result(arr,scorea,scoreb+arr[high],low,high-1,chance);
        }
    }
}