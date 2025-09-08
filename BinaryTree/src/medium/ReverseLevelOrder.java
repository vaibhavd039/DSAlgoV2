package medium;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
Given a binary tree, the task is to find its reverse level order traversal.
The idea is to print the last level first, then the second last level, and so on.
Like Level order traversal, every level is printed from left to right.
 */
public class ReverseLevelOrder {
    public static void main(String [] args){
        BinaryTree node  = BinaryTreeBuilder.buildTreeFromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        reverseLevelOrder(node);

    }

    public static void reverseLevelOrder(BinaryTree node){
        Queue<BinaryTree> queue = new LinkedList<>();
        Stack<BinaryTree> stack = new Stack<>();
        queue.add(node);
        while(!queue.isEmpty()){
            BinaryTree curr= queue.poll();
            stack.push(curr);
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop().data+"\t");
        }
    }
}
