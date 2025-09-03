package basic;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

public class CheckPerfectBinaryTee {

    public static void main(String [] args){
        BinaryTree root = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        int height = getDepth(root);
        System.out.println(isPerfect(root, height));

        BinaryTree root1 = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7});
        int height1 = getDepth(root1);
        System.out.println(isPerfect(root1, height1));

        BinaryTree root2 = BinaryTreeBuilder.buildTreeFromArray(new int[] {1});
        int height2 = getDepth(root2);
        System.out.println(isPerfect(root2, height2));
    }

    public static int getDepth(BinaryTree root){
        if(root==null)
            return 0;
        return  1 + Math.max(getDepth(root.left), getDepth(root.right));
    }

    public static boolean isPerfect(BinaryTree node, int height){
        if(node==null)
            return true;
        if(node.left==null && node.right==null)
            return height==1;
        if(node.left==null || node.right==null)
            return false;
        return isPerfect(node.left, height-1) && isPerfect(node.right, height-1);
    }

}
