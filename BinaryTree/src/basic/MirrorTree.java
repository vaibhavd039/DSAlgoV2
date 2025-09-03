package basic;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

public class MirrorTree{
    public static void main(String [] args){
    BinaryTree root1 = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7,8,9,10});
    BinaryTree root2 = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7,8,9,10});
    BinaryTree root3 = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,3,2,7,6,5,4});
    System.out.println(isMirror(root1, root2));
    System.out.println(isMirror(root1, root3));
    }

    public static  boolean isMirror(BinaryTree tree1, BinaryTree tree2){
        if(tree1 ==null && tree2==null)
            return true;
        if(tree1 ==null || tree2==null)
            return true;

        return (tree1.data == tree2.data) && isMirror(tree1.left, tree2.right) && isMirror(tree1.right, tree2.left);

    }
}
