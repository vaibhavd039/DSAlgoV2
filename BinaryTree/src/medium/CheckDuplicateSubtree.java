package medium;

import builder.BinaryTreeBuilder;
import structure.BinaryTree;

//Check if a Binary Tree contains duplicate subtrees of size 2 or more
/*
Given a Binary Tree, the task is to check whether the Binary tree contains a duplicate sub-tree of size 2 or more.
Note: Two same leaf nodes are not considered as the subtree as the size of a leaf node is one.
 */
public class CheckDuplicateSubtree {
    public static void main(String [] args) {
        BinaryTree root = BinaryTreeBuilder.buildTreeFromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

    }
}
