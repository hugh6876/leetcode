package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nyu.tlj.leetcode.common.OutputUtil;

public class CombinationSum {

	public static void main(String[] args) {
		CombinationSum p = new CombinationSum();

		List<List<Integer>> res = p.combinationSum(new int[] { 8,7,4,3 }, 11);

		//OutputUtil.output2Dlist(res);

	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		Arrays.sort(candidates);
		combinationSumGenerator(res,candidates,target, 0,path,0);
		return res;

	}

	public void combinationSumGenerator(List<List<Integer>> res,int[] candidates, int target, int sum,List<Integer> path,int pos) {
		
		for (int i = pos; i < candidates.length; i++) {
			int curSum = sum + candidates[i];
			if (curSum > target) {
				break;
			}
			path.add(candidates[i]);
			if ( curSum  == target) {
				res.add(new ArrayList<Integer>(path));
			}
			
			combinationSumGenerator(res,candidates,target, curSum,path,i);
			path.remove(path.size()-1);
			
			

		}
	}

}
