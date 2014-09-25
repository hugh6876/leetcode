package nyu.tlj.leetcode.solution;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxProfit(int[] prices) {
    	if(prices == null || prices.length == 0){
    		return 0;
    	}
        
    	int min = Integer.MAX_VALUE;
    	int profix = 0;
    	for(int price : prices ){
    		
    		min = price < min ? price : min;
    		
    		profix =  ( price - min ) > profix ? (price - min ) : profix ;
    		
    		
    		
    	}
    	return profix;
    	
    }

}
