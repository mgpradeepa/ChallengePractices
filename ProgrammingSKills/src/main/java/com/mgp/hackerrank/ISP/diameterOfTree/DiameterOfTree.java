package com.mgp.hackerrank.ISP.diameterOfTree;

public class DiameterOfTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Create a tree");
		int[] data = { 40, 30, 22, 38, 68, 78 };
		Node root = new Node();
		root = constructTree(data, root);
		int diameter = diameterofTree(root);
	}

	private static int diameterofTree(Node node) {
		if (node == null) {
			return 0;
		}
		int leftHeight = heightOfTree(node.left);
		int rightHeight = heightOfTree(node.right);

		int leftDiameter = diameterofTree(node.left);
		int rightDiameteer = diameterofTree(node.right);
		return Math.max(leftHeight + rightHeight + 1,
				Math.max(leftDiameter, rightDiameteer));
	}

	private static int heightOfTree(Node node) {
		// TODO Auto-generated method stub

		if (node == null) {
			return 0;
		} else {
			return 1 + Math.max(heightOfTree(node.left),
					heightOfTree(node.right));
		}
	}

	private static Node constructTree(int[] data, Node root) {
		if (root == null)
			for (int i = 0; i < data.length; i++) {

			}

		return null;
	}
}

// class NODE

class Node {
	Node left, right;
	int data;

	Node() {

	}

	Node(int newData) {
		left = right = null;
		data = newData;
	}
}
