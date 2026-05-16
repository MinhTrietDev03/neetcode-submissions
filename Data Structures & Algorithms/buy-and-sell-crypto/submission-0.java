class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int price : prices) {

            // cập nhật giá thấp nhất
            if (price < minPrice) {
                minPrice = price;
            }

            // tính profit
            int profit = price - minPrice;

            // cập nhật profit lớn nhất
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}