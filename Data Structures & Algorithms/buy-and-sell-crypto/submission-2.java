class Solution {
    public int maxProfit(int[] prices) {
        
        //nơi lưu giá trị nhỏ nhất từng gặp
        int minPrice = prices[0];

        // lợi nhuận lớn nhất
        int maxProfit = 0;

        // duyệt từ ngày thứ 2

        for(int i =1 ; i < prices.length ; i++){

            // nếu tìm thấy giá nhỏ hơn 
            if(prices[i]< minPrice){

                // cập nhật giá đã mua tốt nhất
                minPrice = prices[i];

            }

            // tính profit if buy today
            int profit = prices[i] -minPrice;
            
            // cập nhật profit lớn nhất
            if(profit > maxProfit){
                
                maxProfit = profit;
            }
        }
        return maxProfit;

    }
}
