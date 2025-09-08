package iterator;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

import java.util.Stack;

public class IterativePreOrder {
    public static void main(String [] args) {
        BinaryTree root = BinaryTreeBuilder.buildTreeFromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        iterativePreOrder(root);
    }

    public static  void iterativePreOrder(BinaryTree node){
        Stack<BinaryTree> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty() ){
            BinaryTree curr = stack.pop();
            System.out.println(curr.data);
            if(curr.right!=null){
                stack.push(curr.right);
            }
            if(curr.left!=null){
                stack.push(curr.left);
            }
        }
    }
}
