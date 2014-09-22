package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public List<List<Integer>> pathSum(TreeNode root, int sum) {
			List<List<Integer>> res = new ArrayList<List<Integer>>();
			List<Integer> path = new ArrayList<Integer>();
			
			pathSumTool(root,sum,0,res,path);
			
			
			return res;

		}
		
		public void pathSumTool(TreeNode root, int sum,int rSum,List<List<Integer>> res,List<Integer> path) {
			if(root == null){
				return;
			}
			rSum += root.val;
			path.add(root.val);
			if(root.left == null && root.right == null){
				if(sum == rSum){
					res.add(new ArrayList<Integer>(path));
				}
			
			}
			pathSumTool(root.left, sum,rSum,res,path);
		
			pathSumTool(root.right, sum,rSum,res,path);
			path.remove(path.size()-1);
		}

}
