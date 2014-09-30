package nyu.tlj.leetcode.solution;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome vaa = new ValidPalindrome();
		vaa.isPalindrome("1a2");
	}

 	public boolean isPalindrome(String s) {
		boolean isP = true;
		if( s == null || s.length() == 0 || s.length() == 1 ){
			return true;
		}
		s = s.toLowerCase();
		char[] ss = s.toCharArray();
		
		for( int i = 0,j = ss.length - 1; i < j; i++,j-- ){
			while( i < ss.length && isAlphabeta(ss[i]) == false ) {
				i++;
			}
			while( j >= 0 && isAlphabeta(ss[j]) == false ) {
				j--;
			}
			if( i <= j && ss[i] != ss[j] ){
				return false;
			}
			
			
		}
		
		return isP;

	}

	private boolean isAlphabeta(char s) {
		if(  s <= 'z'  &&  s >= 'a'  ) {
			return true;
		}
		if( s >= '0' && s <= '9' ){
			return true;
		}
		return false;
	}

}
