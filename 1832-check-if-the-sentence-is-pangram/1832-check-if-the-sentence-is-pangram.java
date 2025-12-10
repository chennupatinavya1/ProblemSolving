class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] chars = new char[26];
        for (char ch : sentence.toCharArray()) {
            chars[ch - 'a'] = 1;
        }

        for (int i = 0; i < 26; i++) {
            if (chars[i] == 0) {
                return false;
            }
        }
        return true;
    }
}