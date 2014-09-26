package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;
//https://oj.leetcode.com/problems/spiral-matrix/
public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public List<Integer> spiralOrder(int[][] matrix) {
			List<Integer> res = new ArrayList<Integer>();
			if (matrix == null || matrix.length == 0)
				return res;

			int m = matrix.length, n = matrix[0].length;
			int left = 0, right = n - 1, up = 0, buttom = m - 1;
			
			while (left <= right && up <= buttom) {
				for (int i = left; i <= right; i++) {
					res.add(matrix[up][i]);
				}
				if(matrix.length == 1){
					return res;
				}
				if(matrix[0].length == 1){
					for (int i = up+1; i <= buttom; i++) {
						res.add(matrix[i][right]);
					}
					return res;
				}else{
					for (int i = up+1; i <= buttom; i++) {
						res.add(matrix[i][right]);
					}
				}
				
				for (int i = right-1; i >= left && up != buttom; i--) {
					res.add(matrix[buttom][i]);
				}
				for (int i = buttom-1; i >= up+1; i--) {
					res.add(matrix[i][left]);
				}
				left++;
				up++;
				right--;
				buttom--;

			}

			return res;

		}

}
