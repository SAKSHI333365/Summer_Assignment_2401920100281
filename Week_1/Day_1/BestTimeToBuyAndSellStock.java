package Week_1.Day_1;

/*

Problem: Best Time to Buy and Sell Stock

Approach:
Keep track of the minimum stock price seen so far.
For ever day,calculate the profit whenever the larger profit is found.

Time Complexity:O(n)
Space Complexity:O(1)

*/
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            minPrice = Math.min(minPrice, prices[i]);

            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);

        }
        return maxProfit;
    }

}
