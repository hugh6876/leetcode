package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(numRows==0){
			return res;
		}
		List<Integer> level = null;
		int[][] mt = new int[numRows][numRows];
		mt[0][0] = 1;
		for(int i = 1; i < numRows; i++){
			for (int j = 0; j <= i; j++) {
				//mt[i][j] = mt[i-1][j] + (j-1) < 0 ? 0:mt[i-1][j-1];
				if(j==0){
					mt[i][j] = mt[i-1][j];
				}else{
					mt[i][j] = mt[i-1][j] + mt[i-1][j-1];
				}
			}
		}
		
		for(int i = 0; i < numRows; i++){
			level = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				level.add(mt[i][j]);
			}
			res.add(level);
		}
		
		return res;

	}

}
