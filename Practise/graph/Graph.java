package graph;

import java.util.LinkedList;

public class Graph {

	private static Graph instance = null;
	private int v;
	private LinkedList<Integer> adjList[];

	private Graph() {

	}

	public static Graph getInstance(int v) {
		if (instance == null) {
			instance = new Graph();
			instance.v = v;
			instance.adjList = new LinkedList[v];
		}

		return instance;
	}

	public LinkedList[] constructGraph1() {
		int v = 5;
		LinkedList<Integer> list = null;
		for (int i = 0; i < v; i++) {
			if (i == 0) {
				list = new LinkedList<>();
				list.addFirst(1);
				list.addFirst(4);

			}
			if (i == 1) {
				list = new LinkedList<>();
				list.addFirst(0);
				list.addFirst(4);
				list.addFirst(3);
				list.addFirst(2);
			}
			if (i == 2) {
				list = new LinkedList<>();
				list.addFirst(1);
				list.addFirst(3);
			}
			if (i == 3) {
				list = new LinkedList<>();
				list.addFirst(1);
				list.addFirst(2);
				list.addFirst(4);
			}

			if (i == 4) {
				list = new LinkedList<>();
				list.addFirst(0);
				list.addFirst(1);
				list.addFirst(3);
			}

			adjList[i] = list;
		}

		return adjList;

	}

	public void printGraph(Graph graph) {
		int v = graph.v;
		for (int i = 0; i < v; i++) {
			LinkedList<Integer> edges = graph.adjList[i];
			for (int j = 0; j < edges.size(); j++) {
				System.out.print(" -->  " + edges.get(j));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Graph graph = Graph.getInstance(5);
		graph.constructGraph1();
		graph.printGraph(graph);

	}

}
