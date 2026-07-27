class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double val = 0d;
        double sum = 0d;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        double maxSum = sum;
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[j] + nums[i];
            j++;
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum / k * 1.0;
    }
}