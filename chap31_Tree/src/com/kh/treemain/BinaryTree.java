package com.kh.treemain;

public class BinaryTree {

	TreeNode root;
	
	public BinaryTree() {
		this.root = null;
	}
	
	/*
	 * insert �޼���� insertRec �޼���� ���� Ʈ���� ���ο� ��带 �����ϴµ� ���
	 */
	// �ܺο� ����Ǵ� insert �޼���
	public void insert(int data) {
		root = insertRec(root, data);
	}
	
	// ���� ���� �۾� �޼���
	// ��������� ��带 �����ϰ� ������ ��ġ�� ã�� ���ο� ��� ����
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
	 * inOrderTraversal : ���� ��ȸ
	 * inOrderTraversalRec : ���� ��ȸ�� �����Ͽ� Ʈ���� ��带 ���
	 * ���� ���� Ʈ�� -> ���� ��� -> ������ ���� Ʈ�� ������ ���
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
		System.out.println("���� Ʈ�� ���� ��ȸ ���: ");
		tree.inOrderTraversal();
	}

}
