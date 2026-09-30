class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int opena=0,openb=0;
        int arr[]=new int[seq.length()];
        int max=0;
        for(int i=0;i<seq.length();i++){
            char ch=seq.charAt(i);
            if(ch=='(')
                {
                    if(opena>openb){
                        openb++;
                        arr[i]=1;
                    }
                    else{
                        opena++;
                        arr[i]=0;
                    }
                }
                else{
                    if(opena>openb)
                    {
                        opena--;
                        arr[i]=0;
                    }
                    else{
                        openb--;
                        arr[i]=1;
                    }
                }
            }
            return arr;
    }
}