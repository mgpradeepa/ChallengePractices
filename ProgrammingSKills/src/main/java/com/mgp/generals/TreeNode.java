package com.mgp.generals;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
       this.left = left;
       this.right = right;
    }

    public TreeNode getLeft() {
        return this.left;
    }
    public TreeNode getRight() {
        return this.right;
    }
    public int getVal() {
        return this.val;
    }
}
