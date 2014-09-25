package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Integer> preorderTraversal(TreeNode root) {

		ArrayList<Integer> resultArrayList = new ArrayList<Integer>();

		if (root == null)
			return resultArrayList;

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		TreeNode curNode = new TreeNode(0);

		while (stack.empty() == false) {
			curNode = stack.pop();
			while(true){
				resultArrayList.add(curNode.val);
				
				if (curNode.right != null) {
					stack.push(curNode.right);
				}
				curNode = curNode.left;
				if(curNode==null)break;
				
			}
		}

		

		return resultArrayList;

	}

}
