package nyu.tlj.leetcode.common;

import java.util.List;

public class OutputUtil {
	
	
	public static void output2Dlist(List<List<String>> res) {
		List<String> num;
		for (int i = 0; i < res.size(); i++) {
			num = res.get(i);
			for (int j = 0; j < num.size(); j++) {
				System.out.print(num.get(j) + " ,");
			}
			System.out.println();
			
		}
	}
	
	public static void outputOneArraylist(List res) {
		Object num;
		for (int i = 0; i < res.size(); i++) {
			num = res.get(i);
			
			System.out.print(num +"  ,");
			
		}
		
		System.out.println();
	}

	

}
