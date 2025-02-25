class Solution {
    public int romanToInt(String s) {
        int result = 0;
        
        for(int i=0; i<s.length(); i++) {
            int val = getRomanNum(s.charAt(i));
            if(i < s.length() -1 && val < getRomanNum(s.charAt(i+1))) {
                result -= val;
            } else {
                result += val;
            }
        }    
        
        return result;
    }

    private int getRomanNum(char c) {
        return switch(c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}