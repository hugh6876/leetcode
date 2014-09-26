package nyu.tlj.leetcode.solution;

public class SpiralMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int[][] generateMatrix(int n) {
			int[][] res = new int[n][n];
			if( n == 1 ){
			    res[0][0] = 1;
				return res;
			}
			int left = 0, right = n - 1, up = 0, down = n - 1, k = 0;
			
			while( left < right ){
				for(int i = left; i <= right; i++){
					res[up][i] = ++k;
				}
				
				for(int i = up+1; i < down; i++){
					res[i][right] = ++k;
				}
				
				for(int i = right; i >= left; i--){
					res[down][i] = ++k;
				}
				
				for(int i = down-1; i > left; i--){
					res[i][left] = ++k;
				}
				left++;
				right--;
				up++;
				down--;
				
			}
			if( left == right && up == down ) {
				res[left][left] = ++k;
			}
			
			return res;

		}

}
