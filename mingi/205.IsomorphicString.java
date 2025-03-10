class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if(sMap.containsKey(cs)) {
                if(sMap.get(cs) != ct) return false;
            } else {
                sMap.put(cs, ct);
            }

            if(tMap.containsKey(ct)) {
                if(tMap.get(ct) != cs) return false;
            } else {
                tMap.put(ct, cs);
            }
        }
        return true;
    }
}