package arrays;
/*
LeetCode #121 - Best Time to Buy and Sell Stock

Difficulty: Easy
Topic: Arrays

Time Complexity: O(n)
Space Complexity: O(1)

Idea:
Traverse the array once.
Keep track of the minimum price seen so far.
For each price, calculate the current profit.
If the current profit is greater than the maximum profit,
update the maximum profit.
If a lower price is found, update the minimum price.

Learned:
- Keep only the information needed instead of checking all previous elements.
- Track the minimum value while traversing the array.
- Update the answer during a single pass.
- Not every optimization requires an additional data structure.

Solved: 2026-07-06
*/

public class BestTimeToBuyAndSellStock {

        public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;
            for(int i = 0; i<prices.length; i++){
                if(prices[i] < minPrice){
                    minPrice = prices[i];
                } else {
                    int currentProfit = prices[i] - minPrice;
                    maxProfit = Math.max(maxProfit, currentProfit);
                }
            }
            return maxProfit;
        }
}
