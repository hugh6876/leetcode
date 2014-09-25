package nyu.tlj.leetcode.solution;

public class BestTimetoBuyandSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestTimetoBuyandSellStockII t = new BestTimetoBuyandSellStockII();
		int a[] = {1,2};
		 t.maxProfit(a);

	}

	public int maxProfit(int[] prices) {

		if (prices.length < 2) {
			return 0;
		}
		int start = prices[0];
		int profit = 0;
		int i = 1;
		for (i = 1; i < prices.length; i++) {
			
			if(prices[i]>=prices[i-1]) {
				continue;
			}
			
			profit += prices[i-1] - start;
			start = prices[i];
			
		}
		profit += prices[i-1] - start;
		return profit;
	}
}
