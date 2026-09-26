class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        String ans="";
        int find=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            {
                find=i;
                continue;
            }
            else if(s.charAt(i)==')'){
                if(map.get(s.substring(find+1,i))!=null){
                    ans+=map.get(s.substring(find+1,i));
                }
                else
                ans+="?";
                find=-1;
            }
            else if(find==-1){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}