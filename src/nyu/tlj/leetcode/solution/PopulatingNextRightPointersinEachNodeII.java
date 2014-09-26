package nyu.tlj.leetcode.solution;
//http://fisherlei.blogspot.com/2012/12/leetcode-populating-next-right-pointers_29.html
public class PopulatingNextRightPointersinEachNodeII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeLinkNode n1 = new TreeLinkNode(1);
		TreeLinkNode n2 = new TreeLinkNode(2);
		TreeLinkNode n3 = new TreeLinkNode(3);
		TreeLinkNode n4 = new TreeLinkNode(4);
		TreeLinkNode n5 = new TreeLinkNode(5);
		TreeLinkNode n6 = new TreeLinkNode(6);
		TreeLinkNode n7 = new TreeLinkNode(7);
		TreeLinkNode n8 = new TreeLinkNode(8);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = null;
		n3.right = n6;
		n4.left = n7;
		n4.right = null;
		n5.left = null;
		n5.right = null;
		n6.left = null;
		n6.right = n8;
		PopulatingNextRightPointersinEachNodeII pa2 = new PopulatingNextRightPointersinEachNodeII();
		pa2.connect(n1);

	}

	public void connect(TreeLinkNode root) {
		if( root == null ){
			return ;
		}
		if( root.left == null && root.right == null ){
			return;
		}
		TreeLinkNode tmpNode = null;
		TreeLinkNode tmpRoot = new TreeLinkNode(0);
		tmpRoot = root;
		if( root.left != null ){
			root.left.next = root.right;
		}
		
		
		if( tmpRoot.next != null ){
			tmpNode = null;
			while( tmpRoot.next != null) {
				tmpRoot = tmpRoot.next;
				tmpNode = tmpRoot.left != null ? tmpRoot.left : tmpRoot.right;
				if( tmpNode != null ){
					break;
				}
			}
			if( root.right != null ){
				
				root.right.next = tmpNode;// root.next.left == null ? root.next.right : root.next.left;
			}else if( root.left != null && root.right == null ){
				root.left.next = tmpNode;//root.next.left == null ? root.next.right : root.next.left;
			}
		}else {
			
			if( root.right != null){
				root.right.next = null;
			}
		}
		
		connect(root.right);
		connect(root.left);
		

	}

}
