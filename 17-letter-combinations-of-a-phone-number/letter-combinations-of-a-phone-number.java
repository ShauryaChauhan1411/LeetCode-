class Solution {
    public List<String> letterCombinations(String digits) {
        char arr[][]={{},{},{'a','b','c',' '},{'d','e','f',' '},{'g','h','i',' '},{'j','k','l',' '},{'m','n','o',' '},{'p','q','r','s'},{'t','u','v',' '},{'w','x','y','z'}};
        List<String> ans=find(arr,"",digits);
        return ans;
    }
    List<String> find(char arr[][],String curr,String digits){
        if(digits.length()==0)
        {
            List<String> ans=new ArrayList<>();
            ans.add(curr);
            return ans;
        }
        List<String> a=new ArrayList<>();
        int num=digits.charAt(digits.length()-1)-'0';
        int k=3;
        if(num==7||num==9)
        k=4;
        for(int i=0;i<k;i++){
            a.addAll(find(arr,arr[num][i]+curr,digits.substring(0,digits.length()-1)));
        }
        return a;
    }
}