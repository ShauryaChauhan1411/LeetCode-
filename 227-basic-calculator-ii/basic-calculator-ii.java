class Solution {
    public int calculate(String s) {
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Character> sym=new ArrayList<>(); 
        int c=0;
        num.add(0);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ')
            continue;
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
            {
                sym.add(ch);
                num.add(0);
                c++;
            }
            else{
                num.set(c,(num.get(c)*10)+(int)(ch-'0'));
            }
        }
        c=0;
        for(int i=0;i<sym.size();i++){
            if(sym.get(i)=='*'){
                num.set(c+1,num.get(c)*num.get(c+1));
                num.remove(c);
                sym.remove(i);
                i--;
            }
            else if(sym.get(i)=='/'){
                num.set(c+1,num.get(c)/num.get(c+1));
                num.remove(c);
                sym.remove(i);
                i--;
            }
            else{
                c++;
            }
        }
        c=0;
        for(int i=0;i<sym.size();i++){
            if(sym.get(i)=='+'){
                num.set(c+1,num.get(c)+num.get(c+1));
                num.remove(c);
            }
            else if(sym.get(i)=='-'){
                num.set(c+1,num.get(c)-num.get(c+1));
                num.remove(c);
            }
        }
        return num.get(0);
    }
}