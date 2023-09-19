package com.kh.graphmain;
import java.util.LinkedList;
/*
 * ���� ����Ʈ�� ����ؼ� ���� ������ ����
 */
public class Graph {
	private int V; // �׷����� ��� ��
	private LinkedList<Integer>[] adjList; // ���� ����Ʈ �迭
	/*
	 * adjList : �� ��帶�� ����� ��带 �����ϱ� ���� LinkedList ��ü �迭�� �ʱ�ȭ
	 */
	
	// �׷��� ������
	// �׷��� ũ��(��� ��)�� �޾ƿͼ� �׷����� �ʱ�ȭ
	// adjList �迭�� �� ��ʼҸ� �� LinkedList�� �ʱ�ȭ
	public Graph(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		
		for (int i = 0; i < ver; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	// ��带 �׷����� �߰�
	public void addEdge(int source, int des) {
		// source���� des ���� ������ �߰��ϸ� adjList �迭���� source�� �ش��ϴ� LinkedList�� des �߰�
		adjList[source].add(des);
	}
	
	// �׷��� Ž��(���� �켱 Ž��)
	// ���� �켱 Ž���� �����ϰ�, ���� ��带 �Ű������� ����
	public void DFS(int startNode) {
		// �湮 ���θ� �����ϱ� ���� visited �迭 �ʱ�ȭ
		boolean[] visited = new boolean[V];
		DFSUtil(startNode, visited);
	}
	
	private void DFSUtil(int currentNode, boolean[] visited) {
		visited[currentNode] = true;
		System.out.print(currentNode + " "); // ��� ��ȣ ���
		// ���� ���� ����� ���� ��带 Ȯ���ϰ� �湮���� ���� ���� ��带 ��������� �湮
		
		for (int neighbor : adjList[currentNode]) {
			if (!visited[neighbor]) {
				DFSUtil(neighbor, visited);
			}
		}
	}
}
