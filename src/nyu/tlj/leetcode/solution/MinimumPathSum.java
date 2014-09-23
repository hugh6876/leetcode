package nyu.tlj.leetcode.solution;

public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumPathSum sum = new MinimumPathSum();
		int[][] grid = new int[][]{ {1,2}, {5,6}, {1,1} };
		sum.minPathSum(grid);
	}
	public int minPathSum(int[][] grid) {
		int minPath = Integer.MAX_VALUE;
		int m = grid.length, n = grid[0].length;
		int[][] minDp = new int[m][n];
		int sum = 0;
		for (int i = 0; i < grid[0].length; i++) {
			sum += grid[0][i];
			minDp[0][i] = sum; 
		}
		
		for (int i = 1; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(j == 0){
					minDp[i%2][j] = minDp[(i-1)%2][j] + grid[(i)][j];
				}else{
					minDp[i%2][j] = Math.min(grid[i][j] + minDp[(i-1)%2][j], grid[i][j] + minDp[i%2][(j-1)]);
				}
				
				
				
			}
			
		}
		
		
		
		return minDp[(m-1)%2][(n-1)];
		
	}
	
/**

	class Result{
		int minPath = 0;
		public Result(int i){
			this.minPath = i;
		}
		public int getMinPath() {
			return minPath;
		}
		public void setMinPath(int minPath) {
			this.minPath = minPath;
		}
		
	}
	
	public int minPathSum(int[][] grid) {
		
		int res = 0;
		Result result = new Result(Integer.MAX_VALUE);
		minPathSumTool(grid,0,0,result,0);
		
		return result.getMinPath();

	}
	public void minPathSumTool(int[][] grid,int i, int j,Result result,int path) {
		if(i>=0 && i<grid[0].length && j>=0 && j<grid.length){
			path += grid[i][j];
			if(i==grid[0].length && j == grid.length ){
				int minPath = Math.min(result.getMinPath(), path);
				
				result.setMinPath(minPath);
			}
			minPathSumTool(grid,i,j+1,result,path);
			minPathSumTool(grid,i+1,j,result,path);
		}
	}
	 * 	
 * 
 *
 */
}
