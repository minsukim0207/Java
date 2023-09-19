package com.kh.graphprac;
import java.util.LinkedList;

public class GraphPrac {
	private int V;
	private LinkedList<Integer>[] adjList;
	
	public GraphPrac(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		
		for (int i = 0; i < ver; i++) {
			adjList[i] = new LinkedList<>();
		}
	}

	public void addEdge(int source, int des) {
		adjList[source].add(des);
	}
	/*
	          0
	      1          2
	   3    4     5     6
	  7 8  9 10 11 12
	*/
	public void DFS(int startNode) {
		boolean[] visited = new boolean[V];
		DFSUtil(startNode, visited);
	}
	
	private void DFSUtil(int currentNode, boolean[] visited) {
		visited[currentNode] = true;
		System.out.print(currentNode + " ");
		
		for (int neighbor : adjList[currentNode]) {
			if (!visited[neighbor]) {
				DFSUtil(neighbor, visited);
			}
		}
	}
}
