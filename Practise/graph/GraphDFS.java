package graph;

import java.util.LinkedList;

public class GraphDFS {

	LinkedList adjList[];

	public GraphDFS(LinkedList adjList[]) {
		this.adjList = adjList;
	}

	private void DFS(int v, boolean visited[]) {
		System.out.print("  "+v);
		visited[v] = true;
		LinkedList<Integer> list = adjList[v];
		for (int vertex : list) {
			if (!visited[vertex]) {
				DFS(vertex, visited);
			}
		}

	}

	private void doDFS(int v) {
		boolean visited[] = new boolean[adjList.length];
		DFS(v,visited);

	}

	public static void main(String[] args) {
		Graph graph = Graph.getInstance(5);
		LinkedList adjList[] = graph.constructGraph1();
		GraphDFS dfs = new GraphDFS(adjList);
		dfs.doDFS(3);

	}

}
