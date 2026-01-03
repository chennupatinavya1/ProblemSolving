class Solution {
    public int numOfWays(int n) {
        long mod = 1000000007;

        long noOfDiff = 6;
        long noOfAlt = 6;

        for (int i = 2; i <= n; i++) {
            long a = (2 * noOfDiff + 2 * noOfAlt) % mod;
            long b = (2 * noOfDiff + 3 * noOfAlt) % mod;
            noOfDiff = a;
            noOfAlt = b;
        }

        return (int)((noOfDiff + noOfAlt) % mod);
    }
}