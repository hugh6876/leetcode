package nyu.tlj.leetcode.solution;

import java.util.Arrays;

public class SearchforaRange {

	public static void main(String[] args) {
		SearchforaRange sRange = new SearchforaRange();
		int[] res = new int[]{};
		res = sRange.searchRange(new int[]{1}, 1);
		int a;
	}

	public int[] searchRange(int[] A, int target) {
		
		Arrays.sort(A);
		int[] res = new int[] { -1, -1 };
		int low = 0, high = A.length - 1, mid;

		while (low <= high) {
			mid = (low + high) / 2;
			if (A[mid] == target) {

				int i = mid, j = mid;
				while (i < A.length && A[mid] == A[i]) {
					i++;
				}

				while (j > -1 && A[mid] == A[j]) {
					j--;
				}
				res[0] = ++j;
				res[1] = --i;
				return res;

			} else if (A[mid] < target) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		}

		return res;

	}
}
