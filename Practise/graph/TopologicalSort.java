package graph;

import java.util.LinkedList;
import java.util.Stack;

/*
 * Graph should DAG (Directed Asyclic 
 * 
 * Needs to start with the node degree 0. Meanns no incoming edge.
 * 
 * Need to do DFS
 * 
 * Usually while Doing DFS we used to print the vertex and call for all adjacent node recursuly , 
 * Here we need to add into stack and print the stack at last.
 * 
 * https://www.geeksforgeeks.org/topological-sorting/ 
 * 
 * (Graph taken example)
 * 
 */
public class TopologicalSort {

	int V;
	LinkedList<Integer> adj[];

	public TopologicalSort() {
		// TODO Auto-generated constructor stub
	}

	private void constructGraph(int V) {
		this.V = V;
		adj = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	private void addEdge(int a, int b) {
		adj[a].addFirst(b);
	}

	private void printGraph() {
		for (int i = 0; i < V; i++) {
			System.out.print("Head : " + i);
			LinkedList<Integer> list = adj[i];
			for (Integer j : list) {
				System.out.print("-->" + j);
			}
			System.out.println();
		}
		System.out.println();
	}

	private void sort(int v, boolean visited[], Stack<Integer> stack) {
		visited[v] = true;
		LinkedList<Integer> list = adj[v];
		for (int i : list) {
			if (!visited[i]) {
				sort(i, visited, stack);
			}
		}
		stack.push(v);
	}

	private void doTopologicalSort() {
		Stack<Integer> stack = new Stack<>();
		boolean visited[] = new boolean[V];
		for (int i = 0; i < V; i++) {
			if(!visited[i])
			sort(i, visited, stack);
		}
		System.out.println("Topological Sort : ");
		while (!stack.isEmpty()) {
			System.out.print("-->" + stack.pop());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		TopologicalSort sort = new TopologicalSort();
		sort.constructGraph(6);
		sort.addEdge(5, 2);
		sort.addEdge(5, 0);
		sort.addEdge(4, 0);
		sort.addEdge(4, 1);
		sort.addEdge(2, 3);
		sort.addEdge(3, 1);

		sort.printGraph();
		sort.doTopologicalSort();
	}
}
