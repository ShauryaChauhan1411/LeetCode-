class Solution {
    public boolean isValid(String s) {
        int point=-1;
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
            arr[++point]=s.charAt(i);
            else if(s.charAt(i)==')')
            {
                if(point==-1||arr[point]!='(')
                return false;
                point--;
            }
            else if(s.charAt(i)=='}')
            {
                if(point==-1||arr[point]!='{')
                return false;
                point--;
            }
            else if(s.charAt(i)==']')
            {
                if(point==-1||arr[point]!='[')
                return false;
                point--;
            }
            
        }
        if(point==-1)
        return true;
        return false;
    }
}