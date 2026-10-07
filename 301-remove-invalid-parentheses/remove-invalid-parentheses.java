class Solution {
    List<String> ans=new ArrayList<>();
    int max=0;
    public List<String> removeInvalidParentheses(String s) {
        find(s,0,0);
        List<String> lst=new ArrayList<>();
        Set<String> hash=new HashSet<>();
        for(int i=0;i<ans.size();i++){
            if(ans.get(i).length()==max){
                if(!hash.contains(ans.get(i)))
                {
                    lst.add(ans.get(i));
                    hash.add(ans.get(i));
                }
            }
        }
        return lst;
    }
    void find(String s,int ind,int o){
        if(ind==s.length())
        {
            int open=0;
            for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else if(s.charAt(i)==')'){
                if(open>0)
                open--;
                else
                return ;
            }
        }
        if(open>0)
        return;
        max=Math.max(max,s.length());
            ans.add(s);
            return;
        }
        if(!(s.charAt(ind)=='('||s.charAt(ind)==')'))
        find(s,ind+1,o);
        else if(s.charAt(ind)=='('){
            find(s,ind+1,o+1);
            find(s.substring(0,ind)+s.substring(ind+1),ind,o);
        }
        else{
            if(o!=0)
            find(s,ind+1,o-1);
            find(s.substring(0,ind)+s.substring(ind+1),ind,o);
        }
    }
}