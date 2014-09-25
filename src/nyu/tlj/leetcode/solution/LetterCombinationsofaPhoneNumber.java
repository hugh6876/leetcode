package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nyu.tlj.leetcode.common.OutputUtil;


public class LetterCombinationsofaPhoneNumber {

	public static void main(String[] args) {
		LetterCombinationsofaPhoneNumber l = new LetterCombinationsofaPhoneNumber();
		
		l.letterCombinations("");

	}

	public List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<String>();
		if(digits.equalsIgnoreCase("") == true ) {
			res.add("");
			return res;
		}
		
		Map<String,String> dict = new HashMap<String, String>();
		dict.put("2", "abc");
		dict.put("3", "def");
		dict.put("4", "ghi");
		dict.put("5", "jkl");
		dict.put("6", "mno");
		dict.put("7", "pqrs");
		dict.put("8", "tuv");
		dict.put("9", "wxyz");
		
		
		
		StringBuilder path = new StringBuilder();
		
		letterComboGenerator(res,0,digits,path,dict);
		
		//OutputUtil.outputOneArraylist(res);
		
		return res;

	}
	
	
	public void letterComboGenerator(List<String> res, int digitPos,String digits,
			StringBuilder path, Map<String,String> dict) {
		if(digitPos == digits.length() ){
			return;
		}
		String key =  new StringBuilder().append( digits.charAt(digitPos)  ).toString();
		String letters = dict.get(key);
		
		for (int i = 0; i < letters.length(); i++) {
			path.append(letters.charAt(i));
			
			if(path.length() == digits.length()) {
				res.add(path.toString());//i guess it will generat a new string
			}
			
			letterComboGenerator(res,digitPos+1,digits,path,dict);
			
			path.deleteCharAt(path.length()-1);
			
			
		}
		
	}
}
