class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (sum >= target) {
                minLen = Math.min(i - j + 1, minLen);
                while (sum >= target) {
                    minLen = Math.min(i - j + 1, minLen);
                    sum = sum - nums[j];
                    j++;
                }
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }
        return minLen;
    }
}