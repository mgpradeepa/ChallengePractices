package com.mgp.hackerrank.ISP.amazon_aug;

public class MirrorOfATree {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		Node root = null;

		Node res = getMirrorOfTree(root);
		System.out.println(res);

	}

	private static Node getMirrorOfTree(Node root) {

		Node tem = root;

		if (root == null)
			return root;

		Node left = getMirrorOfTree(tem.left);
		Node right = getMirrorOfTree(tem.right);

		root.left = right;
		root.right = left;
		return root;
	}

}

class Node {
	static Node left;
	static Node right;
	static int data;

}
