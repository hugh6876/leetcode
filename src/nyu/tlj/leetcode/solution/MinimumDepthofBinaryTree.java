package nyu.tlj.leetcode.solution;

public class MinimumDepthofBinaryTree {

	public static int min = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		root.left = null;
		root.right = node2;
		node2.left=null;
		node2.right = null;
		
		MinimumDepthofBinaryTree ma = new MinimumDepthofBinaryTree();
		
		ma.minDepth(root);

	}

	public int minDepth(TreeNode root) {
		if(root == null){
			return 0;
		}
		return minDepthUtil(root);
	}

	public int minDepthUtil(TreeNode root) {

		int l = 0, r = 0, min = 0;

		if (root == null) {
			return Integer.MAX_VALUE;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}

		l = minDepthUtil(root.left);
		r = minDepthUtil(root.right);

		if (l > r) {
			min = r;
		}else {
			min = l;
		}
		
		return min + 1;

	}

}
