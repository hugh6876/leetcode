package nyu.tlj.leetcode.solution;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean canJump(int[] A) {
		if(A == null || A.length == 0){
			return false;
		}
		int n = A.length;
		boolean[] dp = new boolean[n];
			dp[0] = true;
		
		
		
		for (int i = 1; i < A.length; i++) {
			
			for (int j = 0; j < i; j++) {
				int cnt = A[j];
				if(dp[j] == true && j+cnt >= i){
					dp[i] = true;
					break;
					
				}
				
			}
			
		}
		return dp[n-1];

	}
	
	
	
	public boolean canJump2(int[] A) {
		if(A == null || A.length == 0){
			return false;
		}
		int n = A.length;
		boolean[] dp = new boolean[n];
		if(A[0] == 0){
			dp[0] = false;
		}else{
			dp[0] = true;
		}
		
		
		
		for (int i = 0; i < A.length; i++) {
			int cnt = A[i];
			
			while(cnt >= 0) {
				if( (i+cnt) < n  && dp[i] == true){
					dp[i+cnt] = true;
				}
				cnt--;
			}
			
			
		}
		return dp[n-1];

	}

}
