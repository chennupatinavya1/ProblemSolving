class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hp = new HashMap<>();
        
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String s = new String(charArray);
            
            hp.computeIfAbsent(s, k -> new ArrayList<>()).add(str);
        }
        
        return new ArrayList<>(hp.values());
    }
}