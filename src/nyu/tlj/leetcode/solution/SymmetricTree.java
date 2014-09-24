package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode r = new TreeNode(2);
		root.left = r;
		root.right = null;

		SymmetricTree symmetricTree = new SymmetricTree();
		symmetricTree.isSymmetric(root);

	}

	public boolean isSymmetric(TreeNode root) {
		Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
		if (root == null) {
			return true;
		}

		List<TreeNode> level = new ArrayList<TreeNode>();
		TreeNode tmpNode = null;
	
		queue1.offer(root);
		while (!queue1.isEmpty()) {
			int len = queue1.size();
			for (int i = 0; i < len; i++) {
				tmpNode = queue1.poll();
                if(tmpNode!=null){
                   	queue1.offer(tmpNode.left);

				queue1.offer(tmpNode.right); 
                }
			

				level.add(tmpNode);
			}

			if (isLevelSymmetric(level) == false) {
				return false;
			}
			level.clear();
		

		}
		return true;

	}

	private boolean isLevelSymmetric(List<TreeNode> level) {
		int start = 0, end = level.size() - 1;

		while (start < end) {
			if(level.get(start) == null && level.get(end) == null){
				start++;
				end--;
				continue;
			}
			if(level.get(start) == null || level.get(end) == null){
				return false;
			}
			if (level.get(start).val != level.get(end).val) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
