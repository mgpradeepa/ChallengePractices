package com.mgp.aoip.ISP.pracstring.lc;

import com.mgp.generals.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalOfTree {

    // pre-order traversal of a given tree using iterative and recursive method
    private static List<Integer> preOrderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null ) return result;
        result.add(root.getVal());
        result.addAll(preOrderTraversalRecursive(root.getLeft()));
        result.addAll(preOrderTraversalRecursive(root.getRight()));
        return result;

    }

    private static List<Integer> preOrderTraversalIterative(TreeNode root) {
        // using stack
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Stack<TreeNode> track = new Stack<>();
        track.push(root);
        while(!track.empty()) {
            TreeNode tracked = track.pop();
            result.add(tracked.getVal());
            if(tracked.getRight() != null )track.push(tracked.getRight());
            if(tracked.getLeft() != null )track.push(tracked.getLeft());
        }
        return result;
    }

    public static void main(String[] args) {

        TreeNode l1L = new TreeNode(3);
        TreeNode l0R = new TreeNode(2, l1L, null);
        TreeNode l0 = new TreeNode(1, null,l0R );

        System.out.println("Recursive -> ");
        preOrderTraversalRecursive(l0).forEach(System.out::println);

        System.out.println("Iterative -> ");
        preOrderTraversalIterative(l0).forEach(System.out::println);
    }
}
