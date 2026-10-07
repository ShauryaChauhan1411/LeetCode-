class Solution {
    int ans=0;
    public int totalNQueens(int n) {
        int arr[][]=new int[n][n];
        find(n,arr,0);
        return ans;
    }
    void find(int n,int arr[][],int curr){
        if(curr==n){
            ans++;
            return;
        }
        outer:
        for(int i=0;i<n;i++){
            for(int j=0;j<curr;j++){
                if(arr[j][i]==1)
                continue outer;
            }
            int j=curr-1;
            int k=i-1;
            while(j>=0&&k>=0){
                if(arr[j][k]==1)
                continue outer;
                j--;
                k--;
            }
            j=curr-1;
            k=i+1;
            while(j>=0&&k<n){
                if(arr[j][k]==1)
                continue outer;
                j--;
                k++;
            }
            arr[curr][i]=1;
            find(n,arr,curr+1);
            arr[curr][i]=0;
        }
    }
}