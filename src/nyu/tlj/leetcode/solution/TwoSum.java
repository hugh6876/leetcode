package nyu.tlj.leetcode.solution;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int num = 0;
		for (int i = 0; i < numbers.length; i++) {
			num = target - numbers[i];
			
			if( map.containsKey(num)){
				res[0] = map.get(num) + 1;
				res[1] = i+1;
			}else {
				map.put(numbers[i], i);
			}
			
		}
		
		
		return res;
		
		

	}

}
