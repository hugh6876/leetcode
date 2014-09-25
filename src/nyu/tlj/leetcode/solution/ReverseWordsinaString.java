package nyu.tlj.leetcode.solution;

import java.util.ArrayList;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsinaString rea = new ReverseWordsinaString();
		
		rea.reverseWords("     a    b ");
	}

	public String reverseWords(String s) {
		if(s == null || s.length() == 0){
			return s;
		}
		s.trim();
		String[] ss = s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = ss.length - 1; i >= 0; i-- ){
			if( !ss[i].equals("") ){
				sb.append(ss[i]).append(" ");
			}
		}
		
		String reString = sb.length() == 0 ? "" : sb.toString().substring(0, sb.length()-1);
		
		
		
		return reString.trim();
		


	}
	
	private ArrayList<Integer> getWordsBoarder(char[] ss) {
		ArrayList<Integer> boarder = new ArrayList<Integer>();
		boarder.add(-1);
		for (int i = 0; i < ss.length; i++) {
			if( ss[i] == ' ' ) {
				boarder.add(i);
			}
			
		}
		
		boarder.add( ss.length );
		return boarder;
	}
	
	private char[] ReverseWords(char[] ss,int star, int end){
		
		char tmp;
		for(int i = star, j = end; i < j; i++, j--){
			tmp = ss[j];
			ss[j] = ss[i];
			ss[i] = tmp;
			
		}
		
		return ss;
		
	}

}
