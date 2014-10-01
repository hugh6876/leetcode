package nyu.tlj.leetcode.solution;

public class PalindromPartitioningII {
	// static int minCutNum = Integer.MAX_VALUE;

	public static void main(String[] args) {
		PalindromPartitioningII pIi = new PalindromPartitioningII();
		pIi.minCut("bb");
	}

	public int minCut(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		boolean[][] isPalindrone = getIsPalindrone(s);
		int[] dp = new int[s.length() + 1];
		dp[0] = 0;
		dp[1] = 0;
		for (int i = 1; i < s.length(); i++) {
			dp[i] = Integer.MAX_VALUE;
			if (isPalindrone[0][i] == true) {
				dp[i] = 0;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (isPalindrone[j + 1][i] == true
						&& dp[j] != Integer.MAX_VALUE) {

					dp[i] = Math.min(dp[j] + 1, dp[i]);
				}
			}
		}
		return dp[s.length() - 1];

	}

	private boolean isPalindrome(String s, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	private boolean[][] getIsPalindrone(String s) {
		boolean[][] isPlindrone = new boolean[s.length()][s.length()];

		for (int i = 0; i < s.length(); i++) {
			isPlindrone[i][i] = true;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			isPlindrone[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
		}

		for (int len = 2; len < s.length(); len++) {
			for (int start = 0; start + len < s.length(); start++) {
				isPlindrone[start][start + len] = isPlindrone[start + 1][start
						+ len - 1]
						&& s.charAt(start) == s.charAt(start + len);

			}
		}
		return isPlindrone;

	}

	/**
	 * 1 public int minCut(String s) {
	 * 
	 * List<String> path = new ArrayList<String>(); if(s == null){ return 0; }
	 * minCutHelper(s,path,0,0); System.out.println(minCutNum); return
	 * minCutNum;
	 * 
	 * }
	 * 
	 * 
	 * private void minCutHelper(String src, List<String> path, int pos,int
	 * cutNum) { if(pos == src.length()) { if(minCutNum > cutNum ) { minCutNum =
	 * cutNum-1; } return; } String prefix = null; for (int i = pos+1; i <=
	 * src.length(); i++) { prefix = src.substring(pos, i); if(
	 * isPalindrom(prefix) == false ) { continue; } path.add(prefix);
	 * minCutHelper(src,path,i,cutNum+1); path.remove(path.size()-1); }
	 * 
	 * }
	 * 
	 * 
	 * public boolean isPalindrom(String src) { char[] psrc = src.toCharArray();
	 * 
	 * int i = 0, j = psrc.length - 1;
	 * 
	 * while (i < j) { if (psrc[i] == psrc[j]) { i++; j--; } else { return
	 * false; } }
	 * 
	 * return true;
	 * 
	 * }
	 */
}
