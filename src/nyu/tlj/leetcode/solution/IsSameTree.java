package nyu.tlj.leetcode.solution;

public class IsSameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		boolean isSameTree = false;
		
		if(p == null && q == null){
			return true;
		}else if(p != null && q != null){
			if(p.val != q.val){
				return false;
			}else {
				isSameTree = isSameTree(p.left, q.left);
				if(isSameTree == false)
					return isSameTree;
				isSameTree &= isSameTree(p.right, q.right);
			}
			
		}else {
			return false;
		}
		return isSameTree;
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
