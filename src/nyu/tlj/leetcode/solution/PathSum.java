package nyu.tlj.leetcode.solution;

public class PathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		return hasPathSumTool(root, sum, 0);
	}

	public boolean hasPathSumTool(TreeNode root, int sum, int resSum) {

		resSum += root.val;

		if (root.left == null && root.right == null) {
			if (resSum == sum) {
				return true;
			} else {
				return false;
			}
		}
		if (root.left != null) {
			if (hasPathSumTool(root.left, sum, resSum) == true) {
				return true;
			}
		}
		boolean res = false;
		if (root.right != null) {

			 res = hasPathSumTool(root.right, sum, resSum);
		}
		return res;
	}

}
