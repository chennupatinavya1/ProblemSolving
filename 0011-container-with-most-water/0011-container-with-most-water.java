class Solution {
    public int maxArea(int[] height) {
        int maxWaterAmt = 0;
        int j = height.length - 1, i = 0;
        while (i != j) {
            if (height[i] > height[j]) {
                maxWaterAmt = Math.max(maxWaterAmt, height[j] * (j - i));
                j--;
            } else {
                maxWaterAmt = Math.max(maxWaterAmt, height[i] * (j - i));
                i++;
            }
        }

        return maxWaterAmt;
    }
}