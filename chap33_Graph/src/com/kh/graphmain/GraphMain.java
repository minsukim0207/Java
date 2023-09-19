package com.kh.graphmain;

public class GraphMain {

	public static void main(String[] args) {
		int ver = 5;
		
		Graph graph = new Graph(ver);
		
		// 간선 추가
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		
		System.out.println("DFS: ");
		graph.DFS(0); // DFS 탐색을 시작할 노드의 번호를 전달
	}

}
