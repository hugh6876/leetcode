package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

import nyu.tlj.leetcode.common.OutputUtil;

public class PalindromPartitioning {

	public static void main(String[] args) {
		PalindromPartitioning p = new PalindromPartitioning();
		List<List<String>> res = new ArrayList<List<String>>();
		// System.out.println(p.isPalindrom("aaba"));
		res = p.partition("acc");
		
		OutputUtil.output2Dlist(res);

	}

	public List<List<String>> partition(String s) {

		List<List<String>> res = new ArrayList<List<String>>();
		List<String> path = new ArrayList<String>();
		if(s ==  null){
			return res;
		}
		
		partitionGenerator(res,s,path,0);
		
		return res;

	}

	public void partitionGenerator(List<List<String>> res,String src, List<String> path, int pos) {
		if(pos == src.length()) {
			res.add(new ArrayList<String>(path));
			return;
		}
		String prefix = null;
		for (int i = pos+1; i <= src.length(); i++) {
			prefix = src.substring(pos, i);
			if( isPalindrom(prefix) == false ) {
				continue;
			}
			path.add(prefix);
			partitionGenerator(res,src,path,i);
			path.remove(path.size()-1);
		}

	}

	public boolean isPalindrom(String src) {
		char[] psrc = src.toCharArray();

		int i = 0, j = psrc.length - 1;

		while (i < j) {
			if (psrc[i] == psrc[j]) {
				i++;
				j--;
			} else {
				return false;
			}
		}

		return true;

	}
}
