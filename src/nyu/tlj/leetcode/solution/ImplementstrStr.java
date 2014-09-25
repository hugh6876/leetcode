package nyu.tlj.leetcode.solution;

public class ImplementstrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String strStr(String haystack, String needle) {
		if( needle == null || haystack == null){
			return null;
		}
		int i, j;
		for (i = 0; i < haystack.length() - needle.length() + 1; i++) {
			for (j = 0; j < needle.length(); j++) {
				if(haystack.charAt(i+j) != needle.charAt(j) ){
					break;
					
				}
			}
			if(j == needle.length()){
				return haystack.substring(i);
			}
			
		}
		return null;
		

	}

}
