package nyu.tlj.leetcode.solution;
//http://www.cnblogs.com/AnnieKim/archive/2013/04/25/3041982.html
//http://huntfor.iteye.com/blog/2077967
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagrams aa = new Anagrams();
		aa.anagrams(new String[]{"c","c"});
	}
	

	public List<String> anagrams(String[] strs) {
		List<String> res = new ArrayList<String>();
		if( strs == null || strs.length == 0 ) {
			return res;
		}
		if( strs.length <= 1 ){
			return res;
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		char[] astr = null;
		String str = null;
		for( int i=0; i < strs.length ; i++ ){
			str = strs[i];
			
			String oldStr = new String(str);
			if(str.length()>0){
				astr = str.toCharArray();
				Arrays.sort( astr );
				str = new String(astr);
			}
			if( map.get(str) ==  null ){
				map.put(str, i);
			}else {
				if( map.get(str) >= 0){
					res.add(strs[map.get(str)]);
					map.put(str, -1);
				}
				res.add(oldStr);
			}
		}
		
		
		return res;

	}
	
//
//	public List<String> anagrams(String[] strs) {
//		List<String> res = new ArrayList<String>();
//		if( strs == null || strs.length == 0 ) {
//			return res;
//		}
//		
//		//String tmp = null;
//		char[] tmp = null;
//		char tmpChar;
//		String reString = null;
//		for (int i = 0; i < strs.length; i++) {
//			tmp = strs[i].toCharArray();
//			
//			for(int k = 0, l = (tmp.length - 1) ; k < l; k++, l-- ) {
//				tmpChar = tmp[k];
//				tmp[k] = tmp[l];
//				tmp[l] = tmpChar; 
//				
//			}
//			reString = new String(tmp);
//			res.add(reString);
//		}
//		
//		
//		
//		
//		return res;
//
//	}

}
