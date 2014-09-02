package nyu.tlj.leetcode.solution;

import java.security.cert.TrustAnchor;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean wordBreak(String s, Set<String> dict) {
		if( s == null || s.length() == 0 || dict==null || dict.size() == 0){
			return false;
			
		}
		boolean[] dp = new boolean[s.length()+1];
		dp[0] = true;
		
		for (int i = 1; i <= s.length(); i++) {
			dp[i] = false;
			String tmp = null;
			for (int j = 0; j < i; j++) {
				tmp = s.substring(j, i);
				
				if( ( dp[j] &&  dict.contains(tmp) ) == true ){
					dp[i] = true;
					break;
					
				}
				
			}
			
		}
		
		return dp[s.length()];

	}

}
