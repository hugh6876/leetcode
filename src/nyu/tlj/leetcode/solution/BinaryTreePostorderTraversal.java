package nyu.tlj.leetcode.solution;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 后序遍历的非递归相对来说比较难，根节点需要在其左右孩子都访问结束后才能被访问，因此对于任一节点，先将其入栈，如果p不存在左孩子和右孩子，则可以直接访问它；或者p存在左孩子或者右孩子，但是其左孩子和右孩子都已被访问过了，则同样可以直接访问该节点。若非上述两种情况，则将p的右孩子和左孩子依次入栈，这样就保证了每次去站定元素的时候，左孩子在右孩子前面被访问，左孩子和右孩子在根节点前面被访问。
		 */

	}

	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(root == null)return result;
		TreeNode preNode = null;
		TreeNode cur = null;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		stack.push(root);
		
		while( !stack.empty()) {
			cur = stack.peek();
			
			if( (cur.left == null && cur.right == null) ) {// is leaf
				result.add(cur.val);
				preNode = cur;
				stack.pop();
				
			}else if(preNode!=null &&(cur.left==preNode || cur.right == preNode) ) {//    not leaf   but is postoder
				result.add(cur.val);
				preNode = cur;
				stack.pop();
				
			}else {
				if(cur.right!=null){
					stack.push(cur.right);
				}
				
				if(cur.left !=null){
					stack.push(cur.left);
				}
			}
		}
		return result;
	}

}
