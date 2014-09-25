package nyu.tlj.leetcode.solution;

public class UniquePathsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{0,0},{0,0}};
		UniquePathsII uaIi = new UniquePathsII();
		uaIi.uniquePathsWithObstacles(a);
	}

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid == null || obstacleGrid.length == 0) {
			return 0;
		}
		int m = obstacleGrid.length;
		int[][] dp = new int[100][100];
		if (obstacleGrid[0][0] == 0) {
			dp[0][0] = 1;
		} else {
			dp[0][0] = 0;
		}

		for (int i = 0; i < obstacleGrid.length; i++) {
			for (int j = 0; j < obstacleGrid[i].length; j++) {
				if (i == 0 && j > 0) {
					if (obstacleGrid[i][j] == 0) {
						dp[i][j] = dp[i][j - 1];
					} else {
						dp[i][j] = 0;
					}
				} else if (j == 0 && i > 0) {
					if (obstacleGrid[i][j] == 0) {
						dp[i][j] = dp[i - 1][j];
					} else {
						dp[i][j] = 0;
					}

				} else if(i>0 && j>0) {
					if (obstacleGrid[i][j] == 0) {
						dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//						if (dp[i - 1][j] == 0 && dp[i][j - 1] == 0) {
//							dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//						} else if (dp[i - 1][j] == 0 && dp[i][j - 1] == 1) {
//							dp[i][j] = dp[i - 1][j];
//						} else if (dp[i - 1][j] == 1 && dp[i][j - 1] == 0) {
//							dp[i][j] = dp[i][j - 1];
//						}
					} else {
						dp[i][j] = 0;
					}
				}

			}

		}

		return dp[m - 1][obstacleGrid[m - 1].length - 1];

	}
}
