package com.kh.graphprac;

public class GraphPracMain {

	public static void main(String[] args) {
		int ver = 13;
		
		GraphPrac graph = new GraphPrac(ver);
		
		graph.addEdge(0, 1); // adjList[0].add(1)
		graph.addEdge(0, 2); // adjList[0].add(2)
		graph.addEdge(1, 3); // adjList[1].add(3)
		graph.addEdge(1, 4); // adjList[1].add(4)
		graph.addEdge(2, 5); // adjList[2].add(5)
		graph.addEdge(2, 6); // adjList[2].add(6)
		graph.addEdge(3, 7); // adjList[3].add(7)
		graph.addEdge(3, 8); // adjList[3].add(8)
		graph.addEdge(4, 9); // adjList[4].add(9)
		graph.addEdge(4, 10); // adjList[4].add(10)
		graph.addEdge(5, 11);
		graph.addEdge(5, 12);
		
		System.out.println("DFS");
		graph.DFS(0);
	}

}
