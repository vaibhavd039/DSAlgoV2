package traversal;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

import java.util.Stack;

public class InorderWORecursion {
    public static void main(String [] args){
        BinaryTree root = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        inOrderTraversal(root);
    }

    public static void inOrderTraversal(BinaryTree node){
        Stack<BinaryTree> myStack = new Stack<>();
        if(node==null){
            return;
        }
        BinaryTree curr = node;
        while(!myStack.isEmpty() || curr!=null){
           while(curr!=null){
               myStack.push(curr);
               curr= curr.left;
           }
           curr = myStack.pop();
           System.out.println(curr.data);
           curr=curr.right;
        }
    }
}
