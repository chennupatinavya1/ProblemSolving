class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int s = 0;
            for (int j = 1; j <= Math.sqrt(nums[i]); j++) {
                if (nums[i] % j == 0) {
                    if (j != nums[i] / j) {
                        s = s + j + nums[i] / j;
                        count = count + 2;
                    } else {
                        s = s + j;
                        count++;
                    }
                }
            }
            System.out.println();
            if (count == 4) {
                sum = sum + s;
            }
        }
        return sum;
    }
}