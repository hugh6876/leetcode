package nyu.tlj.leetcode.solution;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void sortColors(int[] A) {

		int index = 0;

		for (int i = 0; i < A.length; i++) {

			if (A[i] > 0) {
				continue;
			}

			int tmp = A[index];
			A[index] = A[i];
			A[i] = tmp;
			index++;

		}

		for (int i = index; i < A.length; i++) {

			if (A[i] > 1) {
				continue;
			}

			int tmp = A[index];
			A[index] = A[i];
			A[i] = tmp;
			index++;

		}

	}

}
