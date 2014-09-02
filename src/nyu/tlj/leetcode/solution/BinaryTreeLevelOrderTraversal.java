package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrder(TreeNode root) {

		List result = new ArrayList();
		if (root == null) {
			return result;

		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.offer(root);

		while (!queue.isEmpty()) {
		
			Queue<Integer> level = new LinkedList<Integer>();
			int len = queue.size();
			TreeNode node = null;
			for (int i = 0; i < len; i++) {
				node = queue.poll();
				level.add(node.val);
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}

			
			result.add(level);

		}

		return result;

	}

}
