package graph;

import java.util.LinkedList;

public class GraphBFS {
	LinkedList adjList[];

	public GraphBFS(LinkedList adjList[]) {
		this.adjList = adjList;
	}

	public void doBFSTraversal(int v) {
		boolean visited[] = new boolean[adjList.length];
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(v);
		visited[v] = true;
		while (!queue.isEmpty()) {
//			System.out.println(queue);
			int vertex = queue.poll();
			System.out.print("  " + vertex);
			LinkedList<Integer> list = adjList[vertex];
//			System.out.println();
			for (Integer ver : list) {
				if(!visited[ver]){
				queue.add(ver);
				visited[ver] = true;
				}
			}

		}
	}

	public static void main(String[] args) {
		Graph graph = Graph.getInstance(5);
		LinkedList adjList[] = graph.constructGraph1();
		GraphBFS bfs = new GraphBFS(adjList);
		bfs.doBFSTraversal(3);
	}
}
