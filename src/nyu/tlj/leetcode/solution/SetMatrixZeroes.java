package nyu.tlj.leetcode.solution;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetMatrixZeroes saa = new SetMatrixZeroes();
		saa.setZeroes(new int[][] { { 0,0,0,5 } ,{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}});
	}

	public void setZeroes(int[][] matrix) {

		if (matrix == null) {
			return;
		}
		int m = matrix.length, n = matrix[0].length;
		boolean[] firstR = new boolean[n];
		boolean[] firstC = new boolean[m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (matrix[i][j] == 0) {
					firstR[j] = true;
					firstC[i] = true;
				}

			}
		}

	
		// setMatricZero(matrix);
		// set column
		for (int i = 0; i < n; i++) {
			if (firstR[i] == true) {
				for (int j = 0; j < m; j++) {
					matrix[j][i] = 0;
				}
			}
		}
		// set row
		for (int i = 0; i < m; i++) {
			if (firstC[i] == true) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		
		
	}



}
