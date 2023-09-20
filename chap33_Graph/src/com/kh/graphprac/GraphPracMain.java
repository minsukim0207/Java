package com.kh.graphprac;

public class GraphPracMain {

	public static void main(String[] args) {
		GraphPracMain gpm = new GraphPracMain();
		gpm.DFSGraph();
		System.out.println();
		gpm.BFSGraph();
	}
	
	public void DFSGraph() {
		int ver = 13;
		
		DFSGraph graph = new DFSGraph(ver);
		
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
		/*
	           0
	      1           2
	   3    4      5     6
	  7 8  9 10  11 12
		*/
		System.out.println("DFS Å½»ö °á°ú");
		graph.DFS(0);
	}
	
	public void BFSGraph() {
		int ver = 15;
		BFSGraph b = new BFSGraph(ver);
		
		b.addEdge(0, 1);
		b.addEdge(0, 2);
		b.addEdge(1, 3);
		b.addEdge(2, 4);
		b.addEdge(2, 5);
		b.addEdge(2, 6);
		b.addEdge(3, 7);
		b.addEdge(3, 8);
		b.addEdge(4, 9);
		b.addEdge(4, 10);
		b.addEdge(5, 11);
		b.addEdge(5, 12);
		b.addEdge(6, 13);
		b.addEdge(6, 14);
		/*
	            0
	      1           2
	   3    4      5      6
	  7 8  9 10  11 12  13 14
		 */
		System.out.println("BFS Å½»ö °á°ú");
		b.BFS(0);
	}
}
