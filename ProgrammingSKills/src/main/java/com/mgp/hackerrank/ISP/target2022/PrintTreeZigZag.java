package com.mgp.hackerrank.ISP.target2022;

import java.util.Stack;

public class PrintTreeZigZag {

    public static void main(String[] args) {
    }
/*
           1
         /    \
        2      3
     /    \    /  \
    7      6   4   5


    1 > 3 > 2  > 7 > 6 > 5 > 4

 */


    // using 2 stack aporach
    static void printZigZagTraversal(TreeNode root) {


        if(root == null ){
            return;

        }

        // declare two stacks
        Stack<TreeNode> curLevel = new Stack<>();
        Stack<TreeNode> nextLevel = new Stack<>();

        /// push the root to cirrent level

        curLevel.push(root);
        boolean leftToRight = true;

        // check if currentStack Is EMpty
        while(!curLevel.isEmpty()) {
            // pop out fromm the stack

            TreeNode node = curLevel.pop();

            System.out.print(node.data + " ");


            // store the data according to the current order

            if(leftToRight) {
                if(node.left  != null) {
                    nextLevel.push(node.left);

                }

                if(node.right != null) {
                    nextLevel.push(node.right);
                }

            }
            else {
                if(node.right != null ) {
                    nextLevel.push((node.right));

                }
                if(node.left != null) {
                    nextLevel.push(node.left);
                }
            }

            if(curLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<TreeNode> temp = curLevel;
                curLevel = nextLevel;
                nextLevel = temp;
            }

        }


    }
}
