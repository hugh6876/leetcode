package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> anagrams(String[] strs) {
		List<String> res = new ArrayList<String>();
		if( strs == null || strs.length == 0 ) {
			return res;
		}
		
		//String tmp = null;
		char[] tmp = null;
		char tmpChar;
		String reString = null;
		for (int i = 0; i < strs.length; i++) {
			tmp = strs[i].toCharArray();
			
			for(int k = 0, l = (tmp.length - 1) ; k < l; k++, l-- ) {
				tmpChar = tmp[k];
				tmp[k] = tmp[l];
				tmp[l] = tmpChar; 
				
			}
			reString = new String(tmp);
			res.add(reString);
		}
		
		
		
		
		return res;

	}

}
