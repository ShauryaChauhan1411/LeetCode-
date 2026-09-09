class Solution {
    public String restoreString(String s, int[] indices) {
        char ans[]=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            ans[indices[i]]=s.charAt(i);
        }
        String str="";
        for(int i=0;i<ans.length;i++){
            str+=ans[i];
        }
        return str;
    }
}   