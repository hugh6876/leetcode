package nyu.tlj.leetcode.solution;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String longestPalindrome(String s) {
		if( s == null ){
			return "";
		}
		
		int start = 0, end = 0;
		int max = Integer.MIN_VALUE;
		char[] ss = s.toCharArray();
		int len = ss.length;
		boolean[][] dp = new boolean[ss.length][ss.length];
		
		for( int i = 0; i < len; i++ ){
			dp[i][i] = true;
			max = 1;
		}
		
		for( int i = 0; i < len -1; i++ ){
			if( ss[i] == ss[i+1] ){
				dp[i][i+1] = true;
				max = 2;
				start = i;
				end = i + 1;
			}else {
				dp[i][i+1] = false;
			}
			
		}
		
		
		for( int k = 3; k <= len; k++ ) {
			for( int i = 0; i < len - k + 1; i++ ){
				if( dp[i+1][i+k-2] && ss[i] == ss[i+k-1]){
					dp[i][i+k-1] = true;
					if( k > max ){
						max = k;
						start = i;
						end = i + k - 1;
					}
				}else {
					dp[i][i+k-1] = false;
				}
				
			}
			
			
		}
		String res = s.substring(start, end+1);
		return res;
		
	}

}
