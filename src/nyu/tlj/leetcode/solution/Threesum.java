package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threesum threesum = new Threesum();
		int[] aa = new int[] { 1, 1, 1 };
		threesum.threeSum(aa);

	}

	public List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int l = 0, r = 0;
		Arrays.sort(num);
		for (int i = 0; i < num.length - 2; i++) {
			if (i != 0 && num[i] == num[i - 1]) {
				continue;
			}
			l = i + 1;
			r = num.length - 1;
			int sum = 0;
			while (l < r) {
				sum = num[i] + num[l] + num[r];
				if (sum == 0) {
					List<Integer> result = new ArrayList<Integer>();
					result.add(num[i]);
					result.add(num[l]);
					result.add(num[r]);
					res.add(result);
					l++;
					r--;
					while (l < r && num[l] == num[l - 1]) {
						l++;
					}

					while (l < r && num[r] == num[r + 1]) {
						r--;
					}

				} else if (sum > 0) {

					r--;

				} else {

					l++;

				}

			}// end while

		}

		return res;

	}

}
