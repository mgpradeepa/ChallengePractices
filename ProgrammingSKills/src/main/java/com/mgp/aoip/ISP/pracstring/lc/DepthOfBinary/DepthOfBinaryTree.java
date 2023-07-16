package com.mgp.aoip.ISP.pracstring.lc.DepthOfBinary;

import com.mgp.generals.TreeNode;

public class DepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {
        if(root == null ) return 0;

        return 1+ Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode res = new TreeNode(100, left, right);
        System.out.println("Depth of a binary tree -> " + maxDepth(res));
    }
}
