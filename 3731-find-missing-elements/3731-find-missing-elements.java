class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        int val = nums[0];
        int i = 1;
        while (i < nums.length) {
            if (val + 1 == nums[i]) {
                i++;
            } else {
                li.add(val + 1);
            }
            val++;
        }
        return li;
    }
}