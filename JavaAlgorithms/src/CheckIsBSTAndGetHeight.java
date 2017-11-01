
public class CheckIsBSTAndGetHeight {
	/* 1 - check is binary search tree
	 * 2 - The Binary Search tree formed with the given values is
      3  
     /  \
    2    5
   /    /  \
  1    4    6
             \
              7
The maximum length root to leaf path is 3->5->6->7. There are 4 nodes in this path. 
Therefore the height of the binary tree = 4. */
	public static class Node {
		Node left, right;
		int data;
	}
	
	public boolean isBinarySearchTree(Node node, int min, int max) {
		if (node == null) {
			return true;
		}
		
		if (node.data < min || node.data > max) {
			return false;
		}
		
		return isBinarySearchTree(node.left, min, node.data - 1) 
				&& isBinarySearchTree(node.right, node.data + 1, max);
	}
	
	boolean checkBST(Node root) {
		return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
    
	/* Get the max height of the binary tree, starting at root */
	public static int getHeight(Node root) {
		int height;
		if (root == null) {  /* If root is null, we have an empty tree */
			return 0;
		}
		
		int leftHalf = getHeight(root.left);
		int rightHalf = getHeight(root.right);
		
		if (leftHalf > rightHalf) {
			height = leftHalf + 1;
		} else {
			height = rightHalf + 1;
		}
		
		return height;
	}
	
	public static int getHeightBST(Node root) {
		int leftHalf = 0;
		int rightHalf = 0;
		if (root != null) {
			if (root.left != null) {
				leftHalf = getHeightBST(root.left);
			}
			if (root.right != null) {
				rightHalf = getHeightBST(root.right);
			}
		}
		
		return leftHalf > rightHalf ?  leftHalf + 1 : rightHalf + 1;
	}
}
