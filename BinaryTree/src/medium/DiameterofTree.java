package medium;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

public class DiameterofTree {

    static  int currentDiameter = Integer.MIN_VALUE;
    public static void main(String [] args) {
        BinaryTree root = BinaryTreeBuilder.buildTreeFromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        getDiameter(root);
        System.out.println(currentDiameter);
    }

    public static int getDiameter(BinaryTree node){
        if(node==null)
            return 0;
        int leftHeight   =  getDiameter(node.left);
        int rightHeight = getDiameter(node.right);
        currentDiameter = Math.max((1+leftHeight+rightHeight), currentDiameter);
        return  1 + Math.max(leftHeight , rightHeight);
    }
}
