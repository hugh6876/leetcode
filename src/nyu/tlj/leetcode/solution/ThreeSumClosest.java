package nyu.tlj.leetcode.solution;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int threeSumClosest(int[] num, int target) {
		int res = 0;
		int min = Integer.MAX_VALUE;
		int l, r, sum;
		Arrays.sort(num);
		for (int i = 0; i < num.length - 2; i++) {
			if( i != 0 && num[i] == num[i-1] ){
				continue;
			}
			l = i + 1;
			r = num.length - 1;

			while (l < r) {
				sum = num[i] + num[l] + num[r];
				if (sum == target) {
					res = sum;
					return res;
				}
				if(Math.abs(target - sum) < min ) {
					min = Math.abs(target - sum);
					res = sum;
				}
				
				if( sum > target ){
					
					r--;
				}else{
					l++;
				}

			}

		}

		return res;
	}

}
