class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        find(board,n,0);
        return ans;
    }
    void find(char board[][],int n,int c){
        if(c==n){
            List<String> curr=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String str="";
                for(int j=0;j<board[0].length;j++){
                    str+=board[i][j];
                }
                curr.add(str);
            }
            ans.add(curr);
        }
        outer:
        for(int i=0;i<n;i++){
            for(int j=c-1;j>=0;j--){
                if(board[j][i]=='Q')
                continue outer;
            }
            int r=c-1,col=i-1;
            while(r>=0&&col>=0){
                if(board[r][col]=='Q')
                continue outer;
                r--;
                col--;
            }
            r=c-1;col=i+1;
            while(r>=0&&col<n){
                if(board[r][col]=='Q')
                continue outer;
                r--;
                col++;
            }
            board[c][i]='Q';
            find(board,n,c+1);
            board[c][i]='.';
        }
    }
}