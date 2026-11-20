package easy.solution_121;

// 121. Best Time to Buy and Sell Stock

public class Solution_121 {

    //public int maxProfit(int[] prices) {
    //    int lowestPrice = Integer.MAX_VALUE;
    //    int ans = 0;
    //
    //    for (int i = 0; i < prices.length; i++) {
    //        if (prices[i] < lowestPrice) {
    //            lowestPrice = prices[i];
    //            continue;
    //        }
    //
    //        //int tmp = prices[i] - lowestPrice;
    //        //if (tmp > ans) {
    //        //    ans = tmp;
    //        //}
    //
    //        ans = Math.max(ans, prices[i] - lowestPrice);
    //    }
    //
    //    return ans;
    //}

    //public int maxProfit(int[] prices) {
    //    int buyIndex = 0;
    //    int profit = 0;
    //
    //    for (int sellIndex = 1; sellIndex < prices.length; sellIndex++) {
    //        if (prices[sellIndex] < prices[buyIndex]) {
    //            buyIndex = sellIndex;
    //            continue;
    //        }
    //
    //        profit = Math.max(profit, prices[sellIndex] - prices[buyIndex]);
    //    }
    //
    //    return profit;
    //}

    //public int maxProfit(int[] prices) {
    //    int ans = 0;
    //
    //    for (int j = 0, i = j + 1; i < prices.length; i++) {
    //        if (prices[i] <= prices[j]) {
    //            j = i;
    //            continue;
    //        }
    //
    //        ans = Math.max(ans, prices[i] - prices[j]);
    //    }
    //
    //    return ans;
    //}

    public int maxProfit(int[] prices) {
        int max = 0;

        for (int left = 0, right = left + 1; right < prices.length; right++) {
            if (prices[right] <= prices[left]) {
                left = right;
                continue;
            }
            max = Math.max(max, (prices[right] - prices[left]));
        }
        return max;
    }

    public static void main(String[] args) {
        Solution_121 solution = new Solution_121();

        //int[] prices1 = new int[]{7, 1, 5, 3, 6, 4};
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(solution.maxProfit(prices1));
        System.out.println();

        //int[] prices2 = new int[]{7, 6, 4, 3, 1};
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(solution.maxProfit(prices2));
        System.out.println();
    }
}
