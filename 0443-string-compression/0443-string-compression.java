class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        int i = 0;
        int j = i;
        int count = 0;
        String s = "";
        while (i < chars.length && j < chars.length) {
            count = 0;
            while (j < chars.length && chars[i] == chars[j]) {
                j++;
                count++;
            }
            s = s + chars[i];
            System.out.println(s);
            if (count == 1) {
                i = j;
                continue;
            } else {
                String str = "";
                while (count > 0) {
                    str = count % 10 + str;
                    count = count / 10;
                }
                s = s + str;
            }
            i = j;
        }
        for (i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        return s.length();
    }
}