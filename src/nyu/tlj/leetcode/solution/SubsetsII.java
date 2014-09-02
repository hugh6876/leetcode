package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

	public static void main(String[] args) {
		SubsetsII subsets = new SubsetsII();
		subsets.subsetsWithDup(new int[]{1,1,2,2});

	}

	public List<List<Integer>> subsetsWithDup(int[] S) {
		List<List<Integer>> res = new ArrayList<List<Integer>>(S.length);
		List<Integer> resOneLine = new ArrayList<Integer>();
		Arrays.sort(S);
		res.add(new ArrayList<Integer>());
		subsetsHelper(res,resOneLine,S,0,1);
		
		
		
		output(res);
		return res;
	}
	
	public void subsetsHelper(List<List<Integer>> res,List<Integer> resOneline,int[] num,int pos,int eleNum) {
		//output(res);
		
		for (int i = pos; i <  num.length; i++) {
			
			if(i>0 && i != pos && num[i] == num[i-1] ) {//相同的数字只用第一个  important
				continue;
			}
			
			resOneline.add(num[i]);
			List<Integer> newRes = new ArrayList<Integer>(resOneline);
			
			subsetsHelper(res,resOneline,num,i+1,eleNum++);
			
			
			
			res.add(newRes);
			resOneline.remove(resOneline.size()-1);
		}
	}
	
	public void output(List<List<Integer>> res) {
		List<Integer> num;
		for (int i = 0; i < res.size(); i++) {
			num = res.get(i);
			for (int j = 0; j < num.size(); j++) {
				System.out.print(num.get(j) + " ,");
			}
			System.out.println();
			
		}
		
		
	}
	
	public void outputOneLine(List<Integer> res) {
		int num;
		for (int i = 0; i < res.size(); i++) {
			num = res.get(i);
			
			System.out.print(num +"  ,");
			
		}
		
		System.out.println();
	}

}
