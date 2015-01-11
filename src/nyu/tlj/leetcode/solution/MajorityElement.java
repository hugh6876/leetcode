package nyu.tlj.leetcode.solution;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int majorityElement(int[] num) {
		if( num == null || num.length == 0 ) {
			return 0;
		}
		int n = num.length;
		Arrays.sort(num);
		
		return num[n/2];
		
	}

}
