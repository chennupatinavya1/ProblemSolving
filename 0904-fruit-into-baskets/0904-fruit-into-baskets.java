class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> basket = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int r = 0; r < fruits.length; r++) {
            basket.put(fruits[r], basket.getOrDefault(fruits[r], 0) + 1);
            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }

            max = Math.max(r - left + 1, max);
        }
        return max;
    }
}