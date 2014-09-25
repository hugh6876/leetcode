package nyu.tlj.leetcode.solution;

public class JumpGameII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int jump(int[] A) {
		if(A == null || A.length == 0) {
			return 0;
		}
		int index = 0;
		int[] dp = new int[A.length];
		
		dp[0] = 0;
		
		for(int i = 1; i < A.length; i++) {
			for (int j = 0; j < i; j++) {
				int cnt = A[j];
				if( (j+cnt) >=i && dp[j] > 0 ){
					if(dp[i] == 0 ){
						dp[i] = dp[j] + 1;
						index = i;
					}else{
						if(dp[i] > dp[j] + 1){
							dp[i] = dp[j] + 1;
							index = i;
						}
					}
					
				}
			}
			
		}
		
		return index;
	}

}
