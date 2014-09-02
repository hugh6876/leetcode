package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.lang.model.element.Element;
//important
public class WorkBreakII {

	public static void main(String[] args) {

		// String aString = "ab";
		// aString = aString.substring(0, 2);
		// aString = aString.substring(2);

		// TODO Auto-generated method stub
		WorkBreakII wba = new WorkBreakII();
		Set<String> set = new HashSet<String>();
		set.add("a");
//		set.add("cats");
//		set.add("and");
//		set.add("sand");
//		set.add("dog");
		wba.wordBreak("a", set);
	}

	public ArrayList<String> wordBreak2(String s, Set<String> dict) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		return wordBreakHelper2(s, dict, map);
	}

	public ArrayList<String> wordBreakHelper2(String s, Set<String> dict,
			Map<String, ArrayList<String>> memo) {
		if (memo.containsKey(s))
			return memo.get(s);
		ArrayList<String> result = new ArrayList<String>();
		int n = s.length();
		if (n <= 0)
			return result;
		for (int len = 1; len <= n; ++len) {
			String subfix = s.substring(0, len);
			if (dict.contains(subfix)) {
				if (len == n) {
					result.add(subfix);
				} else {
					String prefix = s.substring(len);
					ArrayList<String> tmp = wordBreakHelper2(prefix, dict, memo);
					for (String item : tmp) {
						item = subfix + " " + item;
						result.add(item);
					}
				}
			}
		}
		memo.put(s, result);
		return result;
	}

	public List<String> wordBreak(String s, Set<String> dict) {

		if (s == null || s.length() == 0 || dict == null || dict.size() == 0) {
			return new ArrayList<String>();

		}
		Map<String, List<String>> memMap = new HashMap<String, List<String>>();
	return	wordbreakTool( s, dict, memMap);

	

	}

	private List<String> wordbreakTool( String s,
			Set<String> dict, 
			Map<String, List<String>> mem) {
		if (mem.containsKey(s)) {

			return mem.get(s);
		}
		List<String> result = new ArrayList<String>();

		String suffix = null;
		String prefix = null;
		for (int i = 1; i <= s.length(); i++) {
			prefix = s.substring(0, i);
			if (dict.contains(prefix)) {
				
				 suffix = s.substring(i);
				 if( suffix.length() == 0 ){
					result.add(prefix);
				 }else{
					  List<String> tmp = wordbreakTool( suffix, dict, mem);
					  for(String item:tmp){
						  item = prefix + " " + item;
						  result.add(item);
					  }
						
				 }
				
			} 

			
		}
		mem.put(s, result);
		return result;

	}

	// private void wordbreakTool(List<String> res,String s, Set<String>
	// dict,int pos,String word,String sentense) {
	// if(pos == s.length()){
	// return;
	// }
	//
	// int len = -1;
	// for (int i = pos; i < s.length(); i++) {
	// word += s.charAt(i);
	// if(dict.contains(word)) {
	// sentense = sentense + word + " ";
	// len = word.length();
	// word = "";
	// if(pos+1 == s.length()){
	// res.add(sentense);
	// }
	// }
	//
	//
	//
	// wordbreakTool(res, s, dict, pos+1, word, sentense);
	//
	// if(len != -1){
	// sentense = sentense.substring(0,sentense.length()-len-1);
	// }else{
	// word = word.substring(0,word.length()-1);
	// }
	//
	//
	//
	// }
	//
	//
	//
	// }

}
