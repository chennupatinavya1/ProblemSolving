class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minAbsDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minAbsDiff = Math.min(minAbsDiff, arr[i] - arr[i - 1]);
        }
        List<List<Integer>> a = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            List<Integer> li = new ArrayList<>();
            if (Math.abs(arr[i] - arr[i - 1]) == minAbsDiff) {
                li.add(arr[i - 1]);
                li.add(arr[i]);
                a.add(new ArrayList<>(li));
            }
        }

        return a;
    }
}