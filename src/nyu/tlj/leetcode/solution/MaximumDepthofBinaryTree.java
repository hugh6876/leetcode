package nyu.tlj.leetcode.solution;



/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MaximumDepthofBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxDepth(TreeNode root) {
		if(root == null) return 0; 
		
		int rightDept = 0;
		int leftDept = 0;
		int maxDept = 0;
		if(root.left == null && root.right == null){
			return 1;
		}
		
		
		leftDept = maxDepth(root.left);
		
		rightDept = maxDepth(root.right);
		
		maxDept = leftDept > rightDept ? leftDept : rightDept; 
		return maxDept + 1;

	}
}


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

}

