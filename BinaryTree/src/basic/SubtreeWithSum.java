package basic;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

public class SubtreeWithSum {
    static    Boolean isPossible = false;
    public static void main(String [] args){
        BinaryTree root = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        isSubTreeAvailable(root, 10);
        System.out.println(isPossible);
    }

    public static int isSubTreeAvailable(BinaryTree node, int targetSum){
        if(node==null)
            return 0;
        int currentSum = node.data + isSubTreeAvailable(node.left, targetSum) + isSubTreeAvailable(node.right, targetSum);
        if(currentSum==targetSum)
            isPossible = true;
        return  currentSum;
    }
}
