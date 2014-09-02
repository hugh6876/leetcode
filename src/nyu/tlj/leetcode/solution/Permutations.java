package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
	
		Permutations p = new Permutations();
		res = p.permute(new int[]{1,1,2});
		
		p.output(res);
		
		
	}

	public List<List<Integer>> permute(int[] num) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		List<Integer> path = new ArrayList<Integer>();
		
		boolean[] flag = new boolean[num.length];
		permuteGenerator(num,flag,path,res);

		return res;

	}
	public void permuteGenerator(int[] num,boolean[] flag,List<Integer> path,List<List<Integer>> res) {
		
		for (int i = 0; i < num.length; i++) {
			if(flag[i] == true) {
				continue;
			}
			
			
			flag[i] = true;
			path.add(num[i]);
		
			
			if(path.size() == num.length){
				List<Integer> resOneLine = new ArrayList<Integer>(path);
				res.add(resOneLine);
			}
			
	
			permuteGenerator(num,flag,path,res);
		
			flag[i] = false;
			path.remove(path.size()-1);
			
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
