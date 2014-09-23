package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<List<Integer>> res2 = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue1 = new LinkedList<TreeNode>();

		if (root == null) {
			return res2;
		}
		TreeNode tnode = null;
		queue1.offer(root);
		while (!queue1.isEmpty()) {
			List<Integer> level = new ArrayList<Integer>();
			int len = queue1.size();
			for (int i = 0; i < len; i++) {
				tnode = queue1.poll();
				level.add(tnode.val);
				if (tnode.left != null) {
					queue1.add(tnode.left);
				}
				if (tnode.right != null) {
					queue1.add(tnode.right);
				}
			}
			res.add(level);
		}

		for (int i = res.size() - 1; i >= 0; i--) {
			res2.add(res.get(i));
		}

		return res2;
	}
}
