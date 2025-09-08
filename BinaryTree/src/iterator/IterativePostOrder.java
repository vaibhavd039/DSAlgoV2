package iterator;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

import java.util.Stack;

// isko reverse pre order krna hia
// fir second stack me daal dena hai
public class IterativePostOrder {
    public static void main(String [] args) {
        BinaryTree root = BinaryTreeBuilder.buildTreeFromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        postOrder(root);
    }

    public static  void postOrder(BinaryTree node){
        Stack<BinaryTree> mystack1 = new Stack<BinaryTree>();
        Stack<BinaryTree> myStack2 = new Stack<BinaryTree>();
        mystack1.add(node);
        while(!mystack1.isEmpty()){
            BinaryTree curr = mystack1.pop();
            myStack2.push(curr);
            if(curr.left!=null){
                mystack1.push(curr.left);
            }

            if(curr.right!=null){
                mystack1.push(curr.right);
            }
        }

        while(!myStack2.isEmpty()){
            System.out.println(myStack2.pop().data);
        }
    }
}
