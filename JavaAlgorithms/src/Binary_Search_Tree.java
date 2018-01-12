
public class Binary_Search_Tree {
// implement binary search tree with insert, contains and printInOrder methods
	public static class Node {
		Node left, right;
		Node root;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
		
		public Node(int data, Node right, Node left){
		    this.data = data;
		    this.right = right;
		    this.left = left;
		}
		
		public void insert(int value) {
			if (value <= data) {
				if (left == null) {
					left = new Node(value);
				} else {
					left.insert(value);
				}
			} else {
				if (right == null) {
					right = new Node(value);
				} else {
					right.insert(value);
				}
			}
		}
		
		public boolean contains(int value) {
			if (value == data) {
				return true;
			} 
			else if (value < data) {
				if (left == null) {
					return false;
				} else {
					return left.contains(value);
				}
			} 
			else {
				if (right == null) {
					return false;
				} else {
					return right.contains(value);
				}		
			}
		}
		
		public void delete(int value) {
			Node parent = this.root;
			while (value != parent.data) {
				if (value > parent.data) {
					if (parent.right == null) {
						break;
					} 
					else {
						parent = parent.right;
					}
				} else if (value < parent.data) {
					if (parent.left == null) {
						break;
					}
					else {
						parent = parent.left;
					}
				}
			}
		  //Case 1: if node to be deleted has no children
			if (parent.left == null && parent.right == null) {
				parent = null;
			}
			//Case 2 : if node to be deleted has only one child
			else if (parent.left != null && parent.left.left == null && parent.left.right == null) {
				parent = parent.left;
			}
			else if (parent.right != null && parent.right.left == null && parent.right.right == null) {
				parent = parent.right;
			} 
			 //now we have found the minimum element in the right sub tree
			else {
				Node tempNode = new Node(parent.data, parent.right, parent.left);				
				tempNode = tempNode.right;
				
				while(true) {
					if (tempNode.left == null) {
						break;
					}
					tempNode = tempNode.left;
				}
				
				parent.data = tempNode.data;
				//check if has the right child, it cannot have left child for sure
				if (tempNode.right != null) {
					tempNode = tempNode.right;
				}
			}
		}
					
		public void printInOrder() {
			// 1 - lqvo pod-darvo                     
			if (left != null) {       
				left.printInOrder();
			}                                // 1 - 2 - 3 --> in-order (lqvo - koren - dqsno)
			// 2 root - koren                // 2 - 1 - 3 --> pre-order (koren - lqvo - dqsno)
			System.out.println(data);        // 1 - 3 - 2 --> post-order (lqvo - dqsno - koren)
			// 3 - dqsno pod-darvo
			if (right != null) {
				right.printInOrder();
			}
		}
	}
}
