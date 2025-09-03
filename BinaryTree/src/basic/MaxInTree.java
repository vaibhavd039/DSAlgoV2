package basic;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MaxInTree {
    public static void main(String [] args){
        BinaryTree root = BinaryTreeBuilder.buildTreeFromArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        System.out.println(getMaxValue(root));
    }

    public static int getMaxValue(BinaryTree root){
        if(root==null)
            return Integer.MIN_VALUE;
        return  Math.max(root.data, Math.max(getMaxValue(root.left), getMaxValue(root.right)));
    }
}
