class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        if((leaveAlice.compareTo(arriveBob)<0)|(leaveBob.compareTo(arriveAlice)<0))
        return 0;
        int start_m=0,start_d=0,end_m=0,end_d=0;
        int ans=arriveAlice.substring(0,2).compareTo(arriveBob.substring(0,2));
        if(ans>0){
            start_m=Integer.parseInt(arriveAlice.substring(0,2));
            start_d=Integer.parseInt(arriveAlice.substring(3,5));
        }
        else if(ans<0){
            start_m=Integer.parseInt(arriveBob.substring(0,2));
            start_d=Integer.parseInt(arriveBob.substring(3,5));
        }
        else{
        ans=arriveAlice.substring(3,5).compareTo(arriveBob.substring(3,5));
        if(ans>0){
            start_m=Integer.parseInt(arriveAlice.substring(0,2));
            start_d=Integer.parseInt(arriveAlice.substring(3,5));
        }
        else if(ans<0){
            start_m=Integer.parseInt(arriveBob.substring(0,2));
            start_d=Integer.parseInt(arriveBob.substring(3,5));
        }
        else{
            start_m=Integer.parseInt(arriveBob.substring(0,2));
            start_d=Integer.parseInt(arriveBob.substring(3,5));
        } 
        }
        ans=leaveAlice.substring(0,2).compareTo(leaveBob.substring(0,2));
        if(ans<0){
            end_m=Integer.parseInt(leaveAlice.substring(0,2));
            end_d=Integer.parseInt(leaveAlice.substring(3,5));
        }
        else if(ans>0){
            end_m=Integer.parseInt(leaveBob.substring(0,2));
            end_d=Integer.parseInt(leaveBob.substring(3,5));
        }
        else{
        ans=leaveAlice.substring(3,5).compareTo(leaveBob.substring(3,5));
        if(ans<0){
            end_m=Integer.parseInt(leaveAlice.substring(0,2));
            end_d=Integer.parseInt(leaveAlice.substring(3,5));
        }
        else if(ans>0){
            end_m=Integer.parseInt(leaveBob.substring(0,2));
            end_d=Integer.parseInt(leaveBob.substring(3,5));
        } 
        else{
            end_m=Integer.parseInt(leaveBob.substring(0,2));
            end_d=Integer.parseInt(leaveBob.substring(3,5));
        }
        }
        if(end_m==start_m){
            return end_d-start_d+1;
        }
        int arr[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int result=arr[start_m]-start_d+1+end_d;
        for(int i=start_m+1;i<end_m;i++){
            result+=arr[i];
        }
        return result;
    }
}