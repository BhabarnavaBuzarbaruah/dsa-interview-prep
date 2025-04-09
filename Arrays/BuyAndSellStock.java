// Problem: Best Time to Buy and Sell Stock
// You are given an array where the ith element is the price of a given stock on day i.
// Find the maximum profit you can achieve. You can only buy once and sell once.
public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE; // To track the minimum price so far
        int maxProfit = 0;                // To track the maximum profit

        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price if a new lower price is found
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate the profit if sold today and update maxProfit if it's higher
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
