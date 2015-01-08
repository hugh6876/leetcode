package nyu.tlj.leetcode.solution;

public class LongestCommonPrefix {

	public static void main(String[] args) {

	}

	public String longestCommonPrefix(String[] strs) {
		if( strs == null || strs.length ==0 ){
			return "";
		}
		String prefix = strs[0];
		int j = 0;
		for( int i = 1; i < strs.length; i++){
			
			for( j = 0; j < prefix.length() && j < strs[i].length(); j++ ){
				if(prefix.charAt(j) != strs[i].charAt(j)){
					break;
				}
			}
			
			prefix = prefix.substring(0,j);
			
			
			
		}
		
		
		return prefix;
	}

}
