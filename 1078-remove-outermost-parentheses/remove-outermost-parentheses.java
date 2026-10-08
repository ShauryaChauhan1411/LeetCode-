class Solution {
    public String removeOuterParentheses(String s) {
        int open=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(open!=0)
                ans+="(";
                open++;
            }
            else{
                if(open!=1)
                ans+=")";
                open--;
            }
        }
        return ans;
    }
}