class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dupSet = new HashSet<>();

        for (int num : nums) {
            dupSet.add(num);
        }

        return (dupSet.size() == nums.length) ? false : true;
    }
}