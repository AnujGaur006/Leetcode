/*

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell

Iterate through the array maintaining least price so far, calculate current profit wrt least price and
then do a maximum of current profit and max_profit.
 */

package Arrays;

class StockBuy {
    public int maxProfit(int[] prices) {

        int lsf = Integer.MAX_VALUE;
        int max_profit = 0;
        int profit = 0 ;

        for (int price : prices) {
            if (price < lsf) {
                lsf = price; //calculate least price so far
            }

            profit = price - lsf; //calculate difference wrt to current price
            if (max_profit < profit) {
                max_profit = profit; //find max_profit
            }
        }

        return max_profit;
    }
}
