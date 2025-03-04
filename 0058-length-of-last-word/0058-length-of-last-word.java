class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String resultStr = arr[arr.length-1];
        return resultStr.length();
    }
}