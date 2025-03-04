class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();

        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();

        return str.equals(reverse);
    }
}