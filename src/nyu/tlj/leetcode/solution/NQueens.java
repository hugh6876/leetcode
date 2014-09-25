package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NQueens na = new NQueens();
		na.solveNQueens(4);

	}

	public List<String[]> solveNQueens(int n) {
		List<String[]> res = new ArrayList<String[]>();
		char[][] maze = new char[n + 1][n + 1];

		solveNQueensHelper(maze, n, 1, res);

		return res;

	}

	private void solveNQueensHelper(char[][] maze, int n, int row,
			List<String[]> res) {
		if (row == (n + 1)) {
			String[] resLine = new String[n];
			for (int i = 1; i <= n; i++) {
				String line = "";
				for (int j = 1; j <= n; j++) {
					line += maze[i][j]=='Q'?'Q':'.';
				}
				resLine[i - 1] = line;
			}
			res.add(resLine);
			return;
		}

		for (int j = 1; j <= n; j++) {
			if (isConflict(maze, row, j, n) == false) {
				maze[row][j] = 'Q';
				solveNQueensHelper(maze, n, row + 1, res);
				maze[row][j] = '.';
			} else {
				maze[row][j] = '.';
			}

		}

	}

	private boolean isConflict(char[][] maze, int x, int y, int n) {
		// row
		for (int i = 1; i <= n; i++) {
			if (maze[i][y] == 'Q') {
				return true;
			}
		}
		// column
		for (int i = 1; i <= n; i++) {
			if (maze[x][i] == 'Q') {
				return true;
			}
		}
		// up left
		for (int i = x, j = y; i > 0 && j > 0; i--, j--) {
			if (maze[i][j] == 'Q') {
				return true;
			}
		}
		// down right
		for (int i = x, j = y; i <= n && j <= n; i++, j++) {
			if (maze[i][j] == 'Q') {
				return true;
			}
		}
		// up right
		for (int i = x, j = y; i <= n && j > 0; i++, j--) {
			if (maze[i][j] == 'Q') {
				return true;
			}
		}
		// down left
		for (int i = x, j = y; i > 0 && j <= n; i--, j++) {
			if (maze[i][j] == 'Q') {
				return true;
			}
		}

		return false;
	}

}
