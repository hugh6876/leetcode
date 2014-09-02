package nyu.tlj.leetcode.solution;

public class UniqueBinarySearchTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int numTrees(int n) {
		int[] cnt = new int[n + 1];
		cnt[0] = 1;
		cnt[1] = 1;

		for (int i = 2; i <= n; i++) {
			cnt[i] = 0;

			for (int j = 0; j <= i - 1; j++) {
				
				cnt[i] += cnt[j] * cnt[i - j - 1];
			}
		}
		return cnt[n];
	}
}
