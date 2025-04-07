import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] pats = pattern.toCharArray();
        String[] strs = s.split(" ");

        if (pats.length != strs.length) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>(); // 역매핑 체크

        for (int i = 0; i < pats.length; i++) {
            char p = pats[i];
            String word = strs[i];

            if (map.containsKey(p)) {
                if (!map.get(p).equals(word)) return false; // 문자열 비교 수정
            } else {
                if (reverseMap.containsKey(word)) return false; // 역방향 매핑 체크
                map.put(p, word);
                reverseMap.put(word, p);
            }
        }
        return true;
    }
}
