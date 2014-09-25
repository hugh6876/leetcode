package nyu.tlj.leetcode.solution;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isBalanced(TreeNode root) {


		return isBalancedTool(root) != -1?true:false;

	}

	public int isBalancedTool(TreeNode root) {
		if (root == null) {
			return 0;
		}


		int l, r;
		
		l = isBalancedTool(root.left);

		r = isBalancedTool(root.right);

		if ( l == -1 || r == -1 || Math.abs( l - r  ) > 1   ) {
			return -1;
		}
		
		return Math.max(l, r) + 1;
		
	}
	
	

}
