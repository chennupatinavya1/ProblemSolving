class Solution {
    public int compress(char[] chars) {
        
        if (chars.length == 1) {
            return 1;
        }
        int i = 0;
        int ch = 0;

        while (i < chars.length) {
            int j = i + 1;
            int count = 1;

            while (j < chars.length && chars[j] == chars[i]) {
                j++;
                count++;
            }

            chars[ch++] = chars[i];
            if (count > 1) {
                String c = String.valueOf(count);
                for (char cha : c.toCharArray()) {
                    chars[ch++] = cha;
                }
            }

            i = j;
            }

        return ch;
    }
}
