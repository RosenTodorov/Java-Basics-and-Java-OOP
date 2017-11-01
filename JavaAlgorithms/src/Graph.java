import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
/* Graph: 
1. Search DFS
2. Search BFS
3. Clone a Directed Graph
*/
public class Graph {
	private HashMap<Integer, Node> actualNodes = new HashMap<Integer, Node>();
	
	public static class Node {
		private int id; // data
		LinkedList<Node> neighbours = new LinkedList<Node>();
		
		private Node(int id) {
			this.id = id;
		}
	}
	
	private Node getNode(int id) {
		return actualNodes.get(id);
	}
	
	public void addEdge(int source, int destination) {
		Node s = getNode(source);
		Node d = getNode(destination);
        s.neighbours.add(d);
	}
	
	// 1. Graph Search, DFS
	public boolean hasPathDFS(int source, int destination) {
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>();
		return hashPathDFS(s, d, visited);
	}
	
	private boolean hashPathDFS(Node source, Node destination, HashSet<Integer> visited) {
		if (visited.contains(source.id)) {
			return false; // veche e poseteno
		}
		visited.add(source.id);
		
		if (source == destination) {
			return true;
		}
		
		for (Node child : source.neighbours) {
			if (hashPathDFS(child, destination, visited)) {
				return true; // ima pat do tarsenata destinacia
			}
		}	
		return false;	//nqma pat
	}
	
	// 2. Graph Search, BFS
	public boolean hashPathBFS(int source, int destination) {
		return hashPathBFS(getNode(source), getNode(destination));
	}
	
	private boolean hashPathBFS(Node source, Node destination) {
		LinkedList<Node> nextToVisit = new LinkedList<Node>();   // or Queue
		HashSet<Integer> visited = new HashSet<Integer>();
		
		while(!nextToVisit.isEmpty()) {
			Node node = nextToVisit.remove();
			if (source == destination) {
				return true;
			}
			
			if (visited.contains(source.id)) {
				continue;
			}
			visited.add(source.id);
			
			for (Node child : node.neighbours) {
				nextToVisit.add(child);
			}
		}
		return false;
	}
	
	// 3. Clone a Directed Graph - Runtime Complexity (Linear, O(n)) and Memory Complexity: Logarithmic, O(n) 
	public static Node clone(Node root) {
		HashMap<Node, Node> visitedNodes = new HashMap<Node, Node>();		
		return cloneGraph(root, visitedNodes);
	}
	
	public static Node cloneGraph(Node root, HashMap<Node, Node> visitedNodes) {
		if (root == null) {
			return null;
		}
	// sazdavame nov graph ili graph sas novi nodes kato zapochvame ot root (korena) s negoviq id or data
		Node newNode = new Node(root.id); // data
		visitedNodes.put(root, newNode);
		for (Node child : root.neighbours) {
			Node cloned = visitedNodes.get(child);
			if (cloned == null) { // dostignal si kraq na kloniraneto na drugia graph
				newNode.neighbours.add(cloneGraph(child, visitedNodes));
			} else {
				newNode.neighbours.add(child);
			}
		}
		return newNode;	
	}	
}

