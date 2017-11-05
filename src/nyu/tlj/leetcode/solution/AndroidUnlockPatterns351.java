package nyu.tlj.leetcode.solution;

import java.net.SocketImpl;

public class AndroidUnlockPatterns351 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static{
		
	}
	
	
	
	boolean[] visited = new boolean[10];
	public int numberOfPatterns(int m, int n) {
		int[][] skip = new int[10][10];
		skip[1][3] = skip[3][1] = 2;
		skip[3][9] = skip[9][3] = 6;
		skip[7][9] = skip[9][7] = 8;
		skip[1][7] = skip[7][1] = 4;
		skip[1][9] = skip[9][1] = skip[2][8] = skip[8][2] = skip[3][7] = skip[7][3] = skip[6][4] = skip[4][6] = 5;	
		
        int result = 0;
		for(int i = m; i <= n; i++){
			result += dfs(i-1,1, skip) * 4;
			result += dfs(i-1,2, skip) * 4;
			result += dfs(i-1,5, skip);
		}
		
		return result;
    }
	
	private int dfs(int remain, int cur, int[][] skip){
		if( remain < 0 ) return 0;
		if( remain == 0 ) return 1;
		
		visited[cur] = true;
		
		int res = 0;
		for( int i = 1; i <= 9; i++ ){
			if(!visited[i] && (skip[cur][i] == 0 || visited[ skip[cur][i] ] )){
				res += dfs(remain - 1, i);
			}
		}
		
		visited[cur] = false;
		
		return res;
	}
}
