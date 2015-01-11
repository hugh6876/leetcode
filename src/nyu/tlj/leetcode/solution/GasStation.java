package nyu.tlj.leetcode.solution;

public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int canCompleteCircuit(int[] gas, int[] cost) {
		if(gas == null || cost == null || gas.length != cost.length ) {
			return -1;
		}
		int index = 0;
		int sum = 0, totalSum = 0;
		int[] dif = new int[gas.length];
		for (int i = 0; i < dif.length; i++) {
			dif[i] = gas[i] - cost[i];
			
		}
		
		for (int i = 0; i < dif.length; i++) {
			sum += dif[i];
			totalSum += dif[i];
			if( sum < 0 ){
				index = i + 1;
				sum = 0;
			}
		}
		
		if( totalSum < 0 ){
			index = -1;
		}
		
		
		return index;
		
		
		

	}

}
