package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "13", s2 = "9";
		String s11 = s2 + s1;
		String s22 = s1 + s2;

		int a = Integer.valueOf(s22) - Integer.valueOf(s11);

	}

	public String largestNumber(int[] num) {
		List<String> nums = new ArrayList<String>();

		for (int i : num) {
			nums.add(String.valueOf(i));
		}
		Collections.sort(nums, cmptor);

		StringBuilder res = new StringBuilder();
		for (String s : nums) {
			res.append(s);
		}

		if (res.indexOf("0") == 0) {
			return "0";
		}

		return res.toString();
	}

	private Comparator<String> cmptor = new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			String s1 = o2 + o1;
			String s2 = o1 + o2;
			return s1.compareTo(s2);
		}

	};

}
