package basic;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

public class SumTree {
    public static void main(String [] args){
        BinaryTree root = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7,8,9,10});

        System.out.println(getSum(root));
    }

    public static int getSum(BinaryTree root){
        if(root==null)
            return 0;
        return  root.data + getSum(root.left) + getSum(root.right);
    }
}
