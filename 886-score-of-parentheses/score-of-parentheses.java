class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> ans=new Stack<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ans.push(res);
                res=0;
            }
            else{
                res=ans.pop()+Math.max(res*2,1);
            }
        }
        return res;
    }
}