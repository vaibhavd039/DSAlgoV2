package basic;

import builder.BinaryTreeBuilder;
import iterator.BinaryTreeTraversor;
import structure.BinaryTree;

public class CreateBasicAndIterate {
    public static void main(String [] args){
        BinaryTree root = BinaryTreeBuilder.buildBasicBinaryTree();
        System.out.println("--------------------------------\n here is pre order \n");
        BinaryTreeTraversor.preOrderTraversal(root);
        System.out.println("--------------------------------\n here is in order \n");
        BinaryTreeTraversor.inOrderTraversal(root);
        System.out.println("--------------------------------\n here is post order \n");
        BinaryTreeTraversor.postOrderTraversal(root);
        System.out.println("-------------------------------- \n here is level order \n");
        BinaryTreeTraversor.levelOrderTraversal(root);
    }
}
