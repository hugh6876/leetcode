package nyu.tlj.leetcode.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestConsecutive(new int[] { 0 });

	}

	public static int longestConsecutive(int[] num) {
		int len = 0, max = 0;

		Map<Integer, Boolean> nums = new HashMap<Integer, Boolean>();

		for (int i = 0; i < num.length; i++) {
			nums.put(num[i], true);
		}
		int left, right;
		
		for (int i = 0; i < num.length; i++) {
			if (nums.get(num[i]) == false) {
				continue;
			}

			len = 0;
			len++;
			nums.put(num[i], false);
			left = num[i];
			while ( nums.containsKey(--left) ) {
				nums.put(left, false);
				len++;
			}
			right = num[i];
			while (nums.containsKey(++right)) {
				nums.put(right, false);
				len++;
			}
			if (len > max) {
				max = len;
			}

		}

		return max;

	}

}
