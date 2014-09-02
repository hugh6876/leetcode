package nyu.tlj.leetcode.solution;

import java.util.ArrayList;

public class NQueensII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueensII na = new NQueensII();
		na.totalNQueens(4);
		
	}
    public int totalNQueens(int n) {
    	
    	
		char[][] maze = new char[n + 1][n + 1];
		int cnt = 0;
		cnt = solveNQueensHelper(maze, n, 1);

		return cnt;
        
    }
    
    
    
    private int solveNQueensHelper(char[][] maze, int n, int row) {
    	int cnt = 0;
		if (row == (n + 1)) {
			
			return 1;
		}

		for (int j = 1; j <= n; j++) {
			if (isConflict(maze, row, j, n) == false) {
				maze[row][j] = 'Q';
				cnt = cnt + solveNQueensHelper(maze, n, row + 1);
				maze[row][j] = '.';
			} else {
				maze[row][j] = '.';
			}

		}
		return cnt;

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
