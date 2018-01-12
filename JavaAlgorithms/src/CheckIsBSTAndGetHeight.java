
public class CheckIsBSTAndGetHeight {
	/* 1 - Check is binary search tree
	 * 2 - The Binary Search tree formed with the given values is
      3  
     /  \
    2    5
   /    /  \
  1    4    6
             \
              7
The maximum length root to leaf path is 3->5->6->7. There are 4 nodes in this path. 
Therefore the height of the binary tree = 4.
       3 - Check if two trees are identical -> the same data and structure */
	public static class Node {
		Node left, right;
		int data;
		int height;
		int weigth;
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
		if (root == null) {  /* If root is null, we have an empty tree */
			return 0;
		}
		
		int leftHalf = getHeight(root.left);
		int rightHalf = getHeight(root.right);
		
		if (leftHalf > rightHalf) {
			root.height = leftHalf + 1;
		} else {
			root.height = rightHalf + 1;
		}
		
		return root.height;
	}
	// 2 variant
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
		
		return leftHalf > rightHalf ?  leftHalf + 1 : rightHalf + 1; // find the min height opposite leftHalf < rightHalf 
	}
	// 3 variant 
	public static int calculateHeight(Node root) {
		if (root == null) {
			return -1;
		}
		return Math.max(calculateHeight(root.left), calculateHeight(root.right)) + 1;
	}
	
	public void calculateWeigth(Node root){
		root.weigth = root.right.weigth + root.left.weigth + 1;
	}
	
	// 3 - Check if two trees are identical -> the same data and structure: runtime complexity - linear O(n); O(h) for memory 
	public static boolean areIdentical(Node root1, Node root2) {
		if (root1 == null && root2 == null) {
			return true;
		}	
		
		if (root1 != null && root2 != null) {
			return ((root1.data == root2.data) && 
					areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right));
		}
		return false;
	}
}
