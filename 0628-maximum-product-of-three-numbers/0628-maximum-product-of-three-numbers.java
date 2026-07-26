class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int prod = 1;
        for (int i = nums.length - 1; i >= nums.length - 1 - 2; i--) {
            prod = prod * nums[i];
            // System.out.println(prod + " " + nums[i]);
        }

        int maxProd = prod;
        prod = nums[nums.length - 1];
        // System.out.println(maxProd);
        for (int i = 0; i < 2; i++) {
            prod = prod * nums[i];
        }
        maxProd = Math.max(prod, maxProd);
        return maxProd;
    }

}