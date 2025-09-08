package medium;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;
import java.util.Stack;

public class SpiralLevelOrder {
    public static void main(String [] args){
        BinaryTree node  = BinaryTreeBuilder.buildTreeFromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        spiralLevelOrder(node);


    }

    public static void spiralLevelOrder(BinaryTree node ) {
        Stack<BinaryTree> stack1 = new Stack<>();
        Stack<BinaryTree> stack2 = new Stack<>();

        stack1.push(node);
        while(!stack1.isEmpty() || !stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                BinaryTree curr = stack1.pop();
                System.out.print(curr.data+"\t");
                if (curr.right != null) {
                    stack2.push(curr.right);
                }
                if (curr.left != null) {
                    stack2.push(curr.left);
                }
            }
            System.out.println(" ");
            while (!stack2.isEmpty()) {
                BinaryTree curr = stack2.pop();
                System.out.print(curr.data+"\t");
                if (curr.left != null) {
                    stack1.push(curr.left);
                }
                if (curr.right != null) {
                    stack1.push(curr.right);
                }
            }
            System.out.println(" ");
        }
    }
}
