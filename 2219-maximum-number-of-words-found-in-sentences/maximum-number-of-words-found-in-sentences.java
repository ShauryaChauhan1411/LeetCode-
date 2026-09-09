class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0,c=0;
        for(int i=0;i<sentences.length;i++){
            c=0;
            sentences[i].trim();
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' ')
                c++;
            }
            max=Math.max(max,c+1);
        }
        max=Math.max(max,c+1);
        return max;
    }
}