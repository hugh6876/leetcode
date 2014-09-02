package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nyu.tlj.leetcode.common.OutputUtil;

public class CombinationSumII {

	public static void main(String[] args) {
		CombinationSumII p = new CombinationSumII();

		List<List<Integer>> res = p.combinationSum2(new int[] { 10,1,2,7,6,1,5 }, 8);

		//OutputUtil.output2Dlist(res);

	}

	public List<List<Integer>> combinationSum2(int[] num, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		Arrays.sort(num);
		combinationSumGenerator(res,num,target, 0,path,0);
		return res;

	}

	public void combinationSumGenerator(List<List<Integer>> res,int[] candidates, int target, int sum,List<Integer> path,int pos) {
		
		for (int i = pos; i < candidates.length; i++) {
			if(i>0 && i!=pos && candidates[i-1] == candidates[i]){
				continue;
			}
			
			int curSum = sum + candidates[i];
			if (curSum > target) {
				break;
			}
			path.add(candidates[i]);
			if ( curSum  == target) {
				res.add(new ArrayList<Integer>(path));
			}
			
			combinationSumGenerator(res,candidates,target, curSum,path,i+1);
			path.remove(path.size()-1);
			
			

		}
	}

}
