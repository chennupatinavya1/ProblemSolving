class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hp = new HashMap<>();
        int max = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (hp.containsKey(s.charAt(i))) {
                j = Math.max(j, hp.get(s.charAt(i)) + 1);
            }
            max = Math.max(max, i - j + 1);
            hp.put(s.charAt(i), i);
        }
        return max;
    }
}