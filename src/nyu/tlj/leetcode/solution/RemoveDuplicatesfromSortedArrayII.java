package nyu.tlj.leetcode.solution;

public class RemoveDuplicatesfromSortedArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int removeDuplicates(int[] A) {
		int len = 0;
		if (A == null || A.length == 0) {
			return len;
		}
		int index = 0, cnt = 1;

		for (int i = 1; i < A.length; i++) {
			if (A[i] == A[index]) {
				if (cnt == 2) {
					continue;
				} else {
					cnt++;
				}
			} else {
				cnt = 1;
			}
			A[++index] = A[i];
		}

		return index + 1;

	}

}
