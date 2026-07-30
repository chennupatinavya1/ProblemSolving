class Solution {
    public int minimumPushes(String word) {
        return (word.length() / 8 * (((word.length() / 8) + 1) * 4) + (word.length() % 8) * ((word.length() / 8) + 1));
    }
}