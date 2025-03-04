class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // 주식 거래가 불가능한 경우
        }

        int minPrice = Integer.MAX_VALUE;
        int max = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            max = Math.max(max, price - minPrice);
        }

        return max;
    }
}