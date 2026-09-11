class Solution {
    public int totalNumbers(int[] digits) {
        int df[] = new int[10];
        int c = digits.length;

        for (int i = 0; i < digits.length; i++) {
            df[digits[i]]++;
        }

        int sum = 0;
        for (int i = 0; i < 10; i += 2) {
            if (df[i] == 0)
                continue;

            df[i] -= 1; 
            for (int h = 1; h < 10; h++) {
                if (df[h] == 0) continue;
                df[h] -= 1; 

                for (int t = 0; t < 10; t++) {
                    if (df[t] > 0) {
                        sum++;
                    }
                }

                df[h] += 1; 
            }

            df[i] += 1; 
        }

        return sum;
    }
}