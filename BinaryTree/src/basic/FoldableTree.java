package basic;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

public class FoldableTree {

    public static void main(String [] args){
        BinaryTree root = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println(isFoldable(root));
    }

    public static boolean isFoldable(BinaryTree node){
        if(node==null)
            return true;
       return isFoldable(node.left, node.right);
    }


    private static  boolean isFoldable(BinaryTree left, BinaryTree right){
        if(left==null && right==null)
            return true;
        if(left==null || right==null)
            return false;
        return isFoldable(left.left, right.right) && isFoldable(left.right, right.left);
    }

}
