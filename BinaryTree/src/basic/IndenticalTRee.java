package basic;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

public class IndenticalTRee {
    public static void main(String [] args){
        BinaryTree root1 = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        BinaryTree root2 = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        BinaryTree root3 = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7});

        System.out.println(isIdentical(root1, root2));

        System.out.println(isIdentical(root3, root2));
    }

    public static boolean isIdentical(BinaryTree tree1, BinaryTree tree2){
        if(tree1==null && tree2==null)
            return true;
        if(tree1==null || tree2==null)
            return false;

        return (tree1.data==tree2.data) && isIdentical(tree1.left, tree2.left) && isIdentical(tree1.right, tree2.right);
    }
}
