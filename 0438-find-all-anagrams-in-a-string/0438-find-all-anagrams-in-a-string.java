class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> hp = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            hp.put(p.charAt(i), hp.getOrDefault(p.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> mp = new HashMap<>();
        List<Integer> li = new LinkedList<>();        
        for (int i = 0; i < s.length(); i++) {
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
            if (i >= p.length()) {
                mp.put(s.charAt(i - p.length()), mp.get(s.charAt(i - p.length())) - 1);
                if (mp.get(s.charAt(i - p.length())) == 0) {
                    mp.remove(s.charAt(i - p.length()));
                }
            }

            if (hp.equals(mp)) {
                li.add(i - p.length() + 1);
            }
        }
        return li;
    }
}