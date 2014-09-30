package nyu.tlj.leetcode.solution;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLastWord(String s) {
		int len = 0;
		if( s == null ){
			 return 0;
		}
		
		String[] ss = s.split(" ");
		if( ss.length == 0 ){
			len = 0;
		}else {
			len = ss[ss.length-1].length();
		}
		
		
		return len;
		
	}

}
