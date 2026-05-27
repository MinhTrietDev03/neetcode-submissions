class Solution {
    public int maxProfit(int[] prices) {
        
        //create save minPrice
        int minPrice = prices[0];

        //create để lưu lợi nhuận tốt nhất
        int maxProfit = 0;

        // duyệt bắt đầu từ ngày thứ 2
        for (int i = 1 ; i < prices.length ; i ++){

            // nếu tìm đượ giá nhỏ hơn thì cập nhật lại
            if(prices[i] < minPrice){
                // update lại
                minPrice = prices[i];
            }

            // tinsg lợi nhuận nếu bán hôm nay
            int profit = prices[i] - minPrice;

            // nếu profit lớn hơn hiện tại thì cập nhật
            if(profit > maxProfit){
                //update maxProfit
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
