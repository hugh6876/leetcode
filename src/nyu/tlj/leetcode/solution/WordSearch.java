package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordSearch ws = new WordSearch();
		ws.test();
	}

	private void test() {

		String tString = "abc";
		char[] s = tString.toCharArray();

	}

	class Position {
		int x = 0;
		int y = 0;

		public Position(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public boolean exist(char[][] board, String word) {
		if (board == null || word == null) {
			return false;
		}
		boolean isExist = false;
		char[] words = word.toCharArray();
		int m = board.length;
		int n = board[0].length;
		int[][] flag = new int[m][n];

		List<Position> directions = new ArrayList<Position>(4);
		directions.add(new Position(-1, 0));
		directions.add(new Position(0, -1));
		directions.add(new Position(1, 0));
		directions.add(new Position(0, 1));
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == words[0] && flag[i][j] == 0) {
					flag[i][j] = 1;
					isExist = existHelper(board, flag, words, directions,new Position(i, j), 1);
					if(isExist == true){
						return isExist;
					}
					flag[i][j] = 0;
				}
			}
		}

		return isExist;
	}

	public boolean existHelper(char[][] board, int[][] flag, char[] words,
			List<Position> directions, Position position, int pos) {
		if (pos == words.length) {
			return true;
		}
		boolean isE = false;

		for (Position p : directions) {
			int i = position.x + p.x;
			int j = position.y + p.y;
			if ((i>=0 && i<board.length) && (j>=0 && j<board[0].length) && board[i][j] == words[pos] && flag[i][j] == 0) {
				flag[i][j] = 1;
				isE = existHelper(board, flag, words, directions, new Position(i, j), pos + 1);
				if( isE == true ){
					return isE;
				}
				flag[i][j] = 0;
			}
			 
		}
		return isE;
	}

}
