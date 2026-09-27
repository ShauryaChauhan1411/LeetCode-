class Solution {
    public String reverseParentheses(String s) {
        String arr[]=new String[s.length()];
        String ans="";
        int top=-1,i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            {
                top++;
                arr[top]="";
            }
            else if(s.charAt(i)==')'){
                if(top==0){
                    for(int j=arr[top].length()-1;j>=0;j--){
                        ans+=arr[top].charAt(j);
                        }
                }
                else{
                    for(int j=arr[top].length()-1;j>=0;j--){
                        arr[top-1]+=arr[top].charAt(j);
                       }
                    }
                    top--;
                }
            else{
                if(top==-1){
                    ans+=s.charAt(i);
                }
                else{
                    arr[top]+=s.charAt(i);
                }
            }
        }
        if(top!=-1){
            for(int j=arr[top].length()-1;j>=0;j--){
                        ans+=arr[top].charAt(j);
                        }
        }
        return ans;
    }
}