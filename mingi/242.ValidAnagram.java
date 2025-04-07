class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> sMap = new HashMap<>();
        char[] sArr = s.toCharArray();
        for(int i=0; i<sArr.length; i++) {
            sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0) + 1);
        }

        for(char c : t.toCharArray()) {
            if(sMap.containsKey(c)) {
                int i = sMap.get(c)-1;
                if(i >= 0) {
                    sMap.put(c, sMap.get(c)-1);
                } else {
                    return false;
                }
            } else {
                return false;
            }

        }
        return true;
    }
}