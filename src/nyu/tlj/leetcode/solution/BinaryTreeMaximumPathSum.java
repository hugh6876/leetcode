package nyu.tlj.leetcode.solution;

public class BinaryTreeMaximumPathSum {
	class Result{
		int maxPath,singlePath;
		public Result(int maxPath,int singlePath){
			this.maxPath = maxPath;
			this.singlePath = singlePath;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxPathSum(TreeNode root) {
		
		Result result;
		result = maxPathSumTool(root);
		
		return result.maxPath;

	}
	
	public Result maxPathSumTool(TreeNode root) {
		Result left,right = null;
		if(root == null){
			return new Result(Integer.MIN_VALUE, 0);
		}
		
		
		left = maxPathSumTool(root.left);
		right = maxPathSumTool(root.right);
		int singlePath = Math.max(left.singlePath, right.singlePath);
		singlePath = singlePath + root.val;
		singlePath = Math.max(singlePath, 0);
		
		int maxPath = Math.max(left.maxPath,right.maxPath);
		maxPath = Math.max(maxPath, left.singlePath + root.val + right.singlePath);
		maxPath = Math.max(maxPath, root.val);
		
		return new Result(maxPath, singlePath);
	}

}
