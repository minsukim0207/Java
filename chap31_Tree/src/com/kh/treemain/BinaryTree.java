package com.kh.treemain;

public class BinaryTree {

	TreeNode root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	/*
	 * insert 메서드와 insertRec 메서드는 이진 트리에 새로운 노드를 삽입하는데 사용
	 */
	// 외부에 노출되는 insert 메서드
	public void insert(int data) {
		root = insertRec(root, data);
	}
	
	// 실제 삽입 작업 메서드
	// 재귀적으로 노드를 삽입하고 적절한 위치를 찾아 새로운 노드 생성
	private TreeNode insertRec(TreeNode root, int data) {
		if (root == null) {
			root = new TreeNode(data);
			return root;
		} else if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}

	/*
	 * inOrderTraversal : 중위 순회
	 * inOrderTraversalRec : 중위 순회를 수행하여 트리의 노드를 출력
	 * 왼쪽 서브 트리 -> 현재 노드 -> 오른쪽 서브 트리 순서로 출력
	 */
	public void inOrderTraversal() {
		inOrderTraversalRec(root);
	}
	
	private void inOrderTraversalRec(TreeNode root) {
		if (root != null) {
			inOrderTraversalRec(root.left);
			System.out.println(root.data + " ");
			inOrderTraversalRec(root.right);
		}
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		System.out.println("이진 트리 중위 순회 결과: ");
		tree.inOrderTraversal();
	}

}
