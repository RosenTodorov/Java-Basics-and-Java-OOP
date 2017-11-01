
public class Binary_Search_Tree {
// implement binary search tree with insert, contains and printInOrder methods
	public static class Node {
		Node left, right;
		int data;
		
		public Node(int data) {
			this.data = data;
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
