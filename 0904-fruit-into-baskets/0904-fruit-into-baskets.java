class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        int maxFruits = 0;
        int j = 0;
        for (int i = 0; i < fruits.length; i++) {
            hp.put(fruits[i], hp.getOrDefault(fruits[i], 0) + 1);
            while (hp.size() > 2) {
                hp.put(fruits[j], hp.get(fruits[j]) - 1);
                if (hp.get(fruits[j]) == 0) {
                    hp.remove(fruits[j]);
                }
                j++;
            }
            maxFruits = Math.max(maxFruits, i - j + 1);
        }

        return maxFruits;
    }
}