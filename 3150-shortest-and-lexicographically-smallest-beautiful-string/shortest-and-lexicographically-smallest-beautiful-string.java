class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int c=0,count=0,i,j,p=0;
        String ans="",max="";
        while(c<s.length())
        {
            max+="1";
            c++;
        }
        for(i=s.length()-1;i>=0;i--){
            count=0;
            for(j=i;j>=0;j--){
                if(s.charAt(j)=='1'){
                    count++;
                    if(count==k)
                    break;
                }
                c++;
            }
            if(count<k)
            break;
            if(count==k){
                p++;
                    if(i+1-j<max.length()||(i+1-j<=max.length()&&max.compareTo(s.substring(j,i+1))>0))
                    max=s.substring(j,i+1);
            }
        }
        if(p==0)
        return "";
        return max;
    }
}