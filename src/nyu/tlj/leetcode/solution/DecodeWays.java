package nyu.tlj.leetcode.solution;

public class DecodeWays {
	 private boolean isValid(String s){
	      	if(s.charAt(0) == '0') {
				return false;
			}
			int n = Integer.valueOf(s);
			if(n>=1 && n <= 26 ){
				return true;
			}
			return false;
		}
		public int numDecodings(String s) {
		    if( s == null || s.length() == 0){
				return 0;
			}
			int[] dp = new int[s.length() + 1];
			dp[0] = 1;
			dp[1] = isValid(s.substring(0,1)) == true ? 1 : 0;
			
			for( int i = 2; i <= s.length(); i++) {
				dp[i] = 0;
				String tmp = s.substring(i-1, i);
				if( isValid( tmp ) == true ){
					dp[i] = dp[i-1]; 
				}
				tmp = s.substring(i-2, i);
				if( isValid(tmp) == true ) {
					dp[i] += dp[i-2];
				}
				
			}
			return dp[s.length()];
		}
}
